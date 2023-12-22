import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            double sum = 0;
            int[] s = new int[n];
            for (int i=0; i<n; ++i) {
                s[i] = sc.nextInt();
                sum += s[i];
            }
            double ave = sum / n;
            sum = 0;
            for (int i=0; i<n; ++i) {
                sum += (s[i] - ave) * (s[i] - ave);
            }
            System.out.println(Math.sqrt(sum / n));
        }
        sc.close();
    }
}

