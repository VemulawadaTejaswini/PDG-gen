import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		int ans = 1;
		while(N / K != 0){
			N /= K;
			ans++;
		}
		System.out.println(ans);
	}	
}