import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		for(int i=0;i<count;i++){
			BigInteger a=sc.nextBigInteger();
			BigInteger b=sc.nextBigInteger();
			a.add(b);
			System.out.println(80<a.toString().length()?"overflow":a.toString());
		}
	}
}