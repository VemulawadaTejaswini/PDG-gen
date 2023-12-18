import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger d = new BigInteger
				("100000000000000000000000000000000000000000000000000000000000000000000000000000000");
		int times = sc.nextInt();
		for(int i = 0; i < times; i++){
			BigInteger a = new BigInteger(sc.next());
			BigInteger b = new BigInteger(sc.next());
			BigInteger c = a.add(b);
			if(c.compareTo(d) == -1){
				System.out.println(c.toString());
			}else{
				System.out.println("overflow");
			}
		}
		sc.close();
	}
}