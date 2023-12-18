import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			BigInteger bi = BigInteger.ZERO;
			bi = bi.add(new BigInteger(sc.next())).add(new BigInteger(sc.next()));
			if(bi.toString().length()>80) System.out.println("overflow");
			else System.out.println(bi);
		}
	}
}