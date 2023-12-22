public class Main {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) { break; }

            int[] s = new int[n];
            double m = 0;
            for (int i = 0; i < n; i ++) {
                s[i] = sc.nextInt();
                m += s[i];
            }
            m /= n;

            double a = 0;
            for (int i = 0; i < n; i ++) { a += (s[i] - m) * (s[i] - m); }
            a = Math.sqrt(a / n);
            System.out.println(String.format("%10.8f", a));
        }
    }
}