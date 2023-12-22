import java.math.BigInteger;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		BigInteger A = new BigInteger(stdIn.nextLine());
		BigInteger B = new BigInteger(stdIn.nextLine());

		if(A.compareTo(B) == 1) {
			System.out.println("GREATER");
		}else if(A.compareTo(B)== -1) {
			System.out.println("LESS");
		}else {
			System.out.println("EQUAL");
		}

	}

}
