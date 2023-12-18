import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int x = scan.nextInt();
        long[] a = new long[N];
        long[] n = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextLong();
            n[i] = a[i];
        }
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                if (x < n[i]) {
                    n[i] = x;
                }
                continue;
            }
            if (x < n[i-1] + n[i]) {
                n[i] = n[i] - (n[i]+n[i-1] - x);
            }
        }
        long answer = 0;
        for (int i = 0; i < N; i++) {
            answer += a[i] - n[i];
        }
        System.out.println(answer);
    }
}
