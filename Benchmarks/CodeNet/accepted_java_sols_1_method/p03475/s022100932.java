import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] c = new int[n];
        int[] s = new int[n];
        int[] f = new int[n];
        for (int i = 0; i < n - 1; i++) {
            c[i] = scan.nextInt();
            s[i] = scan.nextInt();
            f[i] = scan.nextInt();
        }
        f[n-1] = 1;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = (sum < s[j]) ? s[j] : sum;
                if (sum % f[j] != 0) {
                    sum += f[j] - sum % f[j];
                }
                sum += c[j];
            }
            System.out.println(sum);
        }
    }


}
