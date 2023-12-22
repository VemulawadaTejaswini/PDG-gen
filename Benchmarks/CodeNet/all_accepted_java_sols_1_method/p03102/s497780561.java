import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int[][] A = new int[N][M];
        int[] B = new int[M];
        for(int i=0; i<M; i++) {
            B[i] = Integer.parseInt(sc.next());
        }
        int sum = 0;
        int count = 0;
        for(int i=0; i<N; i++) {
            sum = C;
            for(int j=0; j<M; j++) {
                A[i][j] = Integer.parseInt(sc.next());
                sum += A[i][j] * B[j];
            }
            if(sum > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}