import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i < N; i++){
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			if(String.valueOf(a).length() > 80 || String.valueOf(b).length() > 80)
				System.out.println("overflow");
			else
				System.out.println(a.add(b));
		}
		}
}