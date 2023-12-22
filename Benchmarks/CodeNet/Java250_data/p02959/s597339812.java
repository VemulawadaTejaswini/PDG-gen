import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] A = new long[n+1];
		long res = 0;
		for(int i = 0; i < n+1; i++){
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			long d = sc.nextInt();
			if(A[i] + A[i+1] >= d){
				res += d;
				A[i] -= d;
				if(A[i] < 0) A[i+1] += A[i];
			}
			else{
				res += A[i] + A[i+1];
				A[i] -= d;
				if(A[i] < 0) A[i+1] += A[i];
				if(A[i+1] < 0) A[i+1] = 0;
			}
		}
		System.out.println(res);
	}
}
