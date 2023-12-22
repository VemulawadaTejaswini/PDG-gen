import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		try {
			while(scan.hasNext()){
				BigInteger bigInteger1=new BigInteger(scan.next());
				BigInteger bigInteger2=new BigInteger(scan.next());
				BigInteger bigInteger3=bigInteger1.gcd(bigInteger2);
				BigInteger bigInteger4=bigInteger1.multiply(bigInteger2).divide(bigInteger3);
				System.out.println(bigInteger3+" "+bigInteger4);
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}