import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;

            double m = 0;
            int[] s = new int [n];

            for (int i = 0; i < n; i++) {
                s[i] = sc.nextInt();
                m += s[i];
            }
            m /= n;

            double d = 0;

            for (int i = 0; i < n; i++) {
                d += Math.pow(s[i]-m,2);
            }

            System.out.println(Math.sqrt(d / n));
        }
    }
}
