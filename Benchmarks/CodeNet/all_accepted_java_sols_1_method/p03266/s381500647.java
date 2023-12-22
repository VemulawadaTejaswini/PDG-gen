import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		long n = sc.nextLong();
		long k = sc.nextLong();
		long ans = 0L;
		
		long kMulNum = n / k;
		ans += kMulNum * kMulNum * kMulNum;
		
		if(k % 2L == 0L){
			long rHalfKNum = (k * kMulNum + k / 2 <= n) ? kMulNum : kMulNum - 1;
			ans += (rHalfKNum + 1) * (rHalfKNum + 1) * (rHalfKNum + 1);
		}
		System.out.println(ans);
	}
}