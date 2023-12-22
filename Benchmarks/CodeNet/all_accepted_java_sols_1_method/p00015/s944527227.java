import java.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		sc.nextLine();
		String s1 = new String();
		String s2 = new String();
		while (test > 0) {
			test--;
			s1 = sc.nextLine();
			s2 = sc.nextLine();
			//System.out.println(s1 + " " + s2);
			BigInteger b1 = new BigInteger(s1);
			BigInteger b2 = new BigInteger(s2);
			BigInteger result = new BigInteger("0");
			result = result.add(b1);
			result = result.add(b2);
			String s3 = ""+result;
			if(s1.length()>80 || s2.length()>80 || s3.length()>80)
				System.out.println("overflow");
			else
				System.out.println(result);
		}
	}
}