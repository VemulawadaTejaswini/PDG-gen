import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BigInteger re = new BigInteger("1");
		long b = (long) Math.pow(10,18);
		BigInteger big = new BigInteger(b+"");
		int n = in.nextInt();
		for(int i=0; i< n; i++){			
			re = re.multiply(new BigInteger(in.next()));
			//System.out.println(re.compareTo(big));
			
			if(re.compareTo(big)==1){
				System.out.println(-1);
				return;
			}
		}
		System.out.println(re.toString());
	}
}