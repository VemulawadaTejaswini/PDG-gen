import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        
        int A[] = new int[D];
        for(int i = 0; i < N; i++) {
            int d = sc.nextInt();
            int r = 0;
            while( r * d < D ) {
                A[r * d]++;
                r++;
            }
        }
        
        int sum = X;
        for(int i = 0; i < D; i++) {
            sum += A[i];
        }
        
        System.out.println( sum );
    }
}
