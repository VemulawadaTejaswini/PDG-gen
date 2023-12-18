import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long ans =0;
		for(long b =1;b<=N;b++){
			long q = N/b;
			long r = N%b;
			ans = ans+q*Math.max(0,b-K)+Math.max(0,r-K+1);
		}
		if(K==0){
			ans = ans-N;
		}
		System.out.println(ans);
		sc.close();
	}
}
