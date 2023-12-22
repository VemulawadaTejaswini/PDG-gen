import java.math.BigInteger;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		BigInteger X = new BigInteger(scan.next());
		BigInteger Y = new BigInteger(scan.next());
		BigInteger Ai = X;
		int sum = 0;
		while(Ai.compareTo(Y) != 1) {
			Ai = Ai.multiply( BigInteger.valueOf(2) );
			sum++;
		}
		System.out.println(sum);
		scan.close();
	}
 
}