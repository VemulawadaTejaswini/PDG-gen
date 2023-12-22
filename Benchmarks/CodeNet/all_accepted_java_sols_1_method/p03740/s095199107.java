
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger X = new BigInteger(scan.next());
		BigInteger Y = new BigInteger(scan.next());
		if(X.add(Y.negate()).abs().compareTo(new BigInteger("1")) <= 0) {
			System.out.println("Brown");
		} else {
			System.out.println("Alice");
		}
		scan.close();

	}

}
