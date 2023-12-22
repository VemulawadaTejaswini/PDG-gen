import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        long top = 0;
        long result = 0;

        for (int i=0; i<N; i++) {
            if (A[i] > top) {
                top = A[i];
            } else if ((A[i] < top)) {
                result += (top-A[i]);
            }
        }
        
        System.out.println(result);
    }
}
