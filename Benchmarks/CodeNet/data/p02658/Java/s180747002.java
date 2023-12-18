import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		BigInteger[] ans= new BigInteger[n];
		BigInteger res = new BigInteger("1");
		for(int i = 1; i <= n; i++) {
			ans[i] = cin.nextBigInteger();
			res = res.multiply(ans[i]);
		}
		BigInteger bsBigInteger =new BigInteger("1000000000000000000");
		if(res.compareTo(bsBigInteger)>0) {
			System.out.println(-1);
		}else {
			System.out.println(res);
		}
		
	}

}
