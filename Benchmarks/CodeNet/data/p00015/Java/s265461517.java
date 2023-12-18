import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=0;i<t;i++){
			BigInteger b = s.nextBigInteger().add(s.nextBigInteger());
			if(b.toString().length()>80){
				System.out.println("overflow");
			}
			else{
				System.out.println(b.toString());
			}
		}
	}
}