import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n, k;
        int [] a;
        try (Scanner cin = new Scanner(System.in)) {
            n = cin.nextInt();
            k = cin.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = cin.nextInt();
            }
        }

        int r = (n - 1) / (k - 1);
        if ((n - 1) % (k - 1) > 0) r++;

        System.out.println(r);
    }
}