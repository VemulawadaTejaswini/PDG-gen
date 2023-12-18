import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long buf = 1000000000 + 7;
		long ans = 0;
		for(int i = 0;i < N;i++){
			A[i] = sc.nextLong();
		}
		for(int i = 0;i < N - 1;i++){
			for(int j = i + 1;j < N;j++){
				ans += A[i] * A[j] % buf;
			}
		}
		System.out.println(ans);
	}
}