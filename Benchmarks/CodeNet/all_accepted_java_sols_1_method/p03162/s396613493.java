import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static int n;
    static int[] a = {0, 0};
    static int[] b = {0, 0};
    static int[] c = {0, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int ai = sc.nextInt();
            int bi = sc.nextInt();
            int ci = sc.nextInt();
            a[i%2] = ai + Math.max(b[(i+1)%2], c[(i+1)%2]);
            b[i%2] = bi + Math.max(a[(i+1)%2], c[(i+1)%2]);
            c[i%2] = ci + Math.max(a[(i+1)%2], b[(i+1)%2]);
        }
        System.out.println(IntStream.of(a[(n+1)%2], b[(n+1)%2], c[(n+1)%2]).max().getAsInt());
     }

}
