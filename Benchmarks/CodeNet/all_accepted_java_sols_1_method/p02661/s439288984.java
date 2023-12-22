import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);

        if (N%2 == 1) {
            int left = A[N/2];
            int right = B[N/2];
            System.out.println(right-left+1);
        } else { // N%2 == 0
            double left = ((double)A[N/2-1]+A[N/2])/2;
            double right = ((double)B[N/2-1]+B[N/2])/2;
            System.out.println((long)((right-left)/(0.5))+1);
        }
    }
}