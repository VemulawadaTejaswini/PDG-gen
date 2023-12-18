import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-- != 0) {
        	BigInteger b = sc.nextBigInteger().add(sc.nextBigInteger());
        	System.out.println(b.toString().length()>80?"overflow":b.toString());
        }
	}	
}

