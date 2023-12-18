import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object o = run();
        if (o != null)
            System.out.println(o);
    }

    private static ArrayList<Integer> nScan(Scanner sc, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        return al;
    }

    private static Object run() {
        try (Scanner sc = new Scanner(System.in);) {
            int result = 0;
            int time = 0;
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> a = nScan(sc, n);
            ArrayList<Integer> b = nScan(sc, m);
            while (time < k && !a.isEmpty() && !b.isEmpty() ){
                if (a.get(0) < b.get(0)) {
                    System.out.println(a.get(0));
                    time += a.get(0);
                    result++;
                    a.remove(0);
                } else if (a.get(0) > b.get(0)) {
                    System.out.println(b.get(0));
                    time += b.get(0);
                    result++;
                    b.remove(0);
                }
            }
            return result - 1;
        }
    }
}