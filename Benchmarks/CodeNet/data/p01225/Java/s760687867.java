import java.sql.Time;
import java.util.*;
import java.util.stream.DoubleStream;

public class Main {

    private static class Pair {
        char a;
        int b;

        Pair(char a, int b) {
            this.a = a;
            this.b = b;
        }

        Pair(Pair p) {
            a = p.a;
            b = p.b;
        }

        Pair() {
        }
    }

    static Scanner sc;

    private static boolean check(ArrayList<ArrayList<Pair>> split) {
        for (int i = 0; i < 3; ++i) {
            ArrayList<Pair> s = split.get(i);
            char c = s.get(0).a;

            for (int j = 1; j < 3; ++j) {
                if (c != s.get(j).a) {
                    return false;
                }
            }

            int sum = s.get(0).b + s.get(1).b + s.get(2).b;

            for (int j = 0; j < 3; ++j) {
                int diff = s.get(j).b * 3 - sum;
                if (diff != 0 && diff != 3 && diff != -3) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean create(int idx, Pair[] arr, ArrayList<ArrayList<Pair>> split) {
        if (idx == 9) {
            return check(split);
        }

        for (int i = 0; i < 3; ++i) {
            ArrayList<Pair> s = split.get(i);
            if (s.size() == 3)
                continue;
            s.add(arr[idx]);

            if (create(idx + 1, arr, split))
                return true;

            s.remove(s.size() - 1);
        }

        return false;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int l = 0; l < n; ++l) {
            Pair[] arr = new Pair[9];

            for (int i = 0; i < 9; ++i) {
                arr[i] = new Pair('a', sc.nextInt());
            }

            for (int i = 0; i < 9; ++i) {
                arr[i].a = sc.next().charAt(0);
            }

            ArrayList<ArrayList<Pair>> a = new ArrayList<ArrayList<Pair>>();
            for (int i = 0; i < 3; ++i) {
                a.add(i, new ArrayList<Pair>(0));
            }

            System.out.println(create(0, arr, a) ? 1 : 0);

        }
    }
}
