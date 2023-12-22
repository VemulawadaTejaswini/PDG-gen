import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		long L2019 = L % 2019;
		long R2019 = R % 2019;
		
		if(L/2019 != R/2019 || L2019 == 0) {
			System.out.println(0);
			return;
		}
		
		long ans = Long.MAX_VALUE;
		
		for(long i = L2019; i <= R2019-1; i++) {
			for(long j = i+1; j<= R2019; j++) {
				ans = (ans < (i*j)%2019) ? ans : (i*j)%2019;
			}
		}
		
		System.out.println(ans);
	}

}
