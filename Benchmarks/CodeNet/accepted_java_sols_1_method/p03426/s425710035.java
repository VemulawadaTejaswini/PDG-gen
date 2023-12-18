import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int D = scanner.nextInt();

        int[] px = new int[300*300+1];
        int[] py = new int[300*300+1];

        for(int i=1; i<=H; i++){
            for(int j=1; j<=W; j++){
                int A = scanner.nextInt();
                px[A] = i;
                py[A] = j;
            }
        }

        int acc[] = new int[(H+1)*(W+1)];

        for(int i=1; i+D <= H*W; i++){
            acc[i+D] = acc[i] + Math.abs(px[i+D] - px[i]) + Math.abs(py[i+D] - py[i]);
        }

        int Q = scanner.nextInt();
        for(int i=0; i<Q; i++){
            int L = scanner.nextInt();
            int R = scanner.nextInt();

            System.out.println(acc[R] - acc[L]);
        }
    }
}
