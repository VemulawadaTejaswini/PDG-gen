import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // m がaから作れるかを調べる
    public static boolean check(ArrayList<Integer> a, int m) {
        ArrayList<Integer> buf = new ArrayList<Integer>();
        buf.add(0);
        if (m == 0) {
            return true;
        }
        for (int i = 0; i < a.size(); i++) {
            int bufLength = buf.size();
            for (int j = 0; j < bufLength; j++) {
                int x = buf.get(j) + a.get(i);
                if (x == m) {
                    return true;
                } else if (x < m && !buf.contains(x)) {
                    buf.add(x);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            if (check(a, scanner.nextInt())) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        scanner.close();
    }
}

