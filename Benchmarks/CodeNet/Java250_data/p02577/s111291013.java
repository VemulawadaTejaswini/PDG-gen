import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger b1= new BigInteger(scan.nextLine());
		BigInteger b2= new BigInteger("9");
		BigInteger c= new BigInteger("0");
		if((b1.mod(b2)).equals(c)) System.out.println("Yes");
		else System.out.println("No");

	}

}
