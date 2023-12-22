import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long K = sc.nextLong();
		long A = N%K;
		long ans = 0;
		if( N%K==0 ){
			ans = 0;
		}else{
			ans = Math.min( A,K-A );
		}
		System.out.println(ans);
	}
}
