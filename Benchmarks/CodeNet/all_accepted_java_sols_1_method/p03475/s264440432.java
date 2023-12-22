import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int c[][] = new int[n - 1][3];
        for (int i = 0; i < n - 1; i++) {
            c[i][0] = Integer.parseInt(sc.next());
            c[i][1] = Integer.parseInt(sc.next());
            c[i][2] = Integer.parseInt(sc.next());
        }
        sc.close();
        for (int i = 0; i < n - 1; i++) {
            long a = 0;
            for (int j = i; j < n - 1; j++) {
                if (a <= c[j][1]) {
                    a = c[j][1];
                } else {
                    long b = a - c[j][1];
                    if (b % c[j][2] > 0) {
                        a -= b;
                        a += (b / c[j][2]) * c[j][2];
                        a += c[j][2];
                    }
                }
                a += c[j][0];
            }
            System.out.println(a);
        }
        System.out.println(0);
    }
}