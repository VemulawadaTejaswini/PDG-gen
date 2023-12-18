import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        while (!(n == 0 && r == 0)) {

            int[] hanafuda = new int[n];

            for (int i = 0; i < n; i++) {
                hanafuda[i] = n - i;
            }

            for (int i = 0; i < r; i++) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                hanafuda = shuffle(p, c, hanafuda);

            }

            System.out.println(hanafuda[0]);

            n = sc.nextInt();
            r = sc.nextInt();
        }

        sc.close();
    }

    static int[] shuffle(int p, int c, int[] a) {

        int[] keep = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            keep[i] = a[i];
        }

        for (int i = 0; i < p - 1; i++) {
            a[c + i] = keep[i];
        }

        for (int i = 0; i < c; i++) {
            a[i] = keep[p - 1 + i];
        }

        return a;
    }
}
