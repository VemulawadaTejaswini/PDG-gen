import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n, sum;
        int[] s;
        double dev;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n != 0) {
            s = new int [n];
            sum = 0;
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextInt();
                sum += s[i];
            }
            dev = 0;
            for (int i = 0; i < n; i++) 
                dev += (s[i] - ((double)sum / n)) * ((double)s[i] - (sum / n));
            System.out.printf("%.9f\n", Math.sqrt(dev / n));
            n = sc.nextInt();
        }
    }
}
