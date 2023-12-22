import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			BigInteger a = new BigInteger(scan.next());
			BigInteger b = new BigInteger(scan.next());
			System.out.println(a.gcd(b)+" "+(long)a.intValue()*b.intValue()/a.gcd(b).intValue());
		}
	}

}