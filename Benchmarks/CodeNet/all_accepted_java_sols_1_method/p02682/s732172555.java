import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();
		long ans = 0;
		if(K < A){
			ans = K;
		}else if(K <= A + B){
			ans = A;
		}else{
			ans = A - (K - A - B);
		}
		System.out.println(ans);
	}
}