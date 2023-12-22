import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int [N];
        for (int i = 0; i < N; ++i) {
                A[i] = sc.nextInt();
        }
        
        int max = A[0];
        int min = A[0];
        for(int i = 1; i < N; ++i) {
                if (A[i] > max) {
                        max = A[i];
                } else if (A[i] < min) {
                        min = A[i];
                }
        }

        System.out.println(max- min);
	}
}
