import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());

            if (a < b) {
                a ^= b;
                b ^= a;
                a ^= b;
            }

            if (a < c) {
                a ^= c;
                c ^= a;
                a ^= c;
            }

            if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}