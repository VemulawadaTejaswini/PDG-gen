import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for(int i=0; i < N; i++) {
            for(int j=0; j < N-1; j++) {
            	if(A[j] < A[j+1]) {
            		int asc = A[j];
            		A[j] = A[j+1];
            		A[j+1] = asc;
            	}
            }
        }
        int c = 1;
        int sum = 0;
        sum = sum + A[0];
        for (int i = 1; i < N;i++) {
            sum = sum + A[i] + A[i];
            c = c + 2;
            if ( c > N-1) {
                sum = sum - A[i];
                break;
            }
        }
        System.out.println(sum);
    }
}