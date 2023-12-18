
import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			BigInteger a=sc.nextBigInteger();
			a = a.add(sc.nextBigInteger());
			String tmp = a.toString();
			if(tmp.length() > 80) {
				System.out.println("overflow");
			}
			else {
				System.out.println(tmp);
			}

		}

	}

}