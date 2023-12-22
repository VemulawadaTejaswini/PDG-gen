import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] a = new int[N+2];
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            a[i] = in.nextInt();
            sum += Math.abs(a[i] - a[i-1]);
        }
        sum += Math.abs(a[N+1] - a[N]);
        for (int i = 1; i <= N; i++) {
            System.out.println(sum + Math.abs(a[i+1] - a[i-1]) - Math.abs(a[i] - a[i-1]) - Math.abs(a[i+1] - a[i]));
        }
    }
}
