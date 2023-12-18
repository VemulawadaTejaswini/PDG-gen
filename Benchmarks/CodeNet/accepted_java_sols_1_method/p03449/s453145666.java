
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A[][] = new int[2][N];
		int sum = 0;
		for(int i=0;i<2;i++){
			for(int j=0;j<N;j++){
				A[i][j] = scan.nextInt();
				if(i==1) sum += A[i][j];
			}
		}
		sum += A[0][0];
		int S[] = new int[N];
		S[0] = sum;
		for(int i=1;i<N;i++){
			sum = sum - A[1][i-1] + A[0][i];
			S[i] = sum;
		}
		Arrays.sort(S);
		System.out.println(S[N-1]);
	}
}
