import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scan.nextInt();
        long[] a = new long[n+1];
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextLong();
        }
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 1; i <= n / 2; i++) {
                sb.append(a[2*(n/2-i+1)] + " ");
            }
            for (int i = 1; i <= n / 2; i++) {
                sb.append(a[2*i-1] + " ");
            }
        } else {
            for (int i = 0; i < (n - 1) / 2; i++) {
                sb.append(a[2*((n-1)/2-i)+1] + " ");
            }
            sb.append(a[1] + " ");
            for (int i = 1; i <= (n - 1) / 2; i++) {
                sb.append(a[2*i] + " ");
            }
        }
        String text = sb.toString();
        text = text.substring(0, text.length() - 1);
        System.out.println(text);
    }
}
