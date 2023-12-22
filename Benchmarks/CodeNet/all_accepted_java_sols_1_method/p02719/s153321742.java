import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long ans = N;
		if(N > K){
			N = N - (K * (N / K));
		}
		for(int i = 0;i < 2;i++){
			N = Math.abs(N - K);
			if(N < ans){
				ans = N;
			}
		}
		System.out.println(ans);
	}
}