import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			BigInteger a = new BigInteger(sc.next());
			BigInteger b = new BigInteger(sc.next());
			BigInteger c = a.add(b);
			if (c.toString().length() > 80) {
				System.out.println("overflow");
			}else{
				System.out.println(c);
			}
		}
	}

}