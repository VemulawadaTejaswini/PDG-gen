import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int T = sc.nextInt();
        final int A = sc.nextInt();
        final int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        int index = -1;
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            double x = T - H[i] * 0.006;
            if (Math.abs(A-x) < min) {
                index = i;
                min = Math.abs(A-x);
            }
        }

        System.out.println(index+1);
    }
}
