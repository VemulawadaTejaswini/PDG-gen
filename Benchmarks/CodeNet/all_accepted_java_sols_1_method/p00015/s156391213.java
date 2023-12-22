import java.math.BigInteger;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(0!=n--){
			BigInteger a = sc.nextBigInteger().add(sc.nextBigInteger());
			System.out.println(a.toString().length() > 80 ?"overflow":a);
		}
	}
}