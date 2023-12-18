import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
			BigInteger a,b,sum;
		for(int i = 0;i < n ; i++){
			a = sc.nextBigInteger();
			b = sc.nextBigInteger();
			sum = a.add(b);
			if(sum.toString().length() > 80){
				System.out.println("overflow");
			}
			System.out.println(sum);
		}
	}
}