import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String s = sc.next();



		for (int i=0; i<s.length(); i++){

			StringBuffer sb = new StringBuffer(s);

			if (sb.charAt(i) == '0'){
				sb.setCharAt(i, '1');
			} else {
				sb.setCharAt(i, '0');
			}
			BigInteger bin = new BigInteger(sb.toString(), 2);
			System.out.println(f(bin));
		}



	}

	public static int popcount(BigInteger n){

		String bin = n.toString(2);
		int ret =0;

		for (int i=0; i<bin.length(); i++){
			if (bin.charAt(i) == '1'){
				ret++;
			}
		}
		return ret;
	}

	public static int f(BigInteger n){

		int ret = 0;
		while (n.compareTo(new BigInteger("0")) != 0) {
			n = n.remainder(new BigInteger(String.valueOf(popcount(n))));
			ret++;
		}
		return ret;
	}


}