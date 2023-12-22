import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			BigInteger b = sc.nextBigInteger().add(sc.nextBigInteger());
			System.out.println(b.toString().length()>80?"overflow":b.toString());
		}
	}
}