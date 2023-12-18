import java.math.BigInteger;
import java.util.Scanner;

public class Qn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		BigInteger n = s.nextBigInteger();
		
		BigInteger res = new BigInteger("1");
		
		for (int i = 0; i<n.intValue(); i++) {
			res = res.multiply(s.nextBigInteger());
		}
		
		if (res.compareTo(new BigInteger("1000000000000000000")) == 1){
			System.out.print(-1);
		}else {
			System.out.print(res);
		}
		
		
	}

}
