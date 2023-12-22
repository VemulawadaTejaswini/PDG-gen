import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long a[] = new long[N];
        long b[] = new long[N];
        long c[] = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            c[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        long l = 0;
        long smallA[] = new long[N];
        for (int i = 0; i < N; i++) {
            while (l < N) {
                if (b[i] > a[(int) l]) {
                    l++;
                } else {
                    break;
                }
            }
            smallA[i] = l;
        }
        long r = 0;
        long largeC[] = new long[N];
        for (int i = 0; i < N; i++) {
            while (r < N) {
                if (b[i] >= c[(int) r]) {
                    r++;
                } else {
                    break;
                }
            }
            largeC[i] = N - r;
        }
        long count = 0;
        for (int i = 0; i < N; i++) {
            count += smallA[i] * largeC[i];
        }
        System.out.println(count);

    }

}