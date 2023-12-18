import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=0 ; i<num ; i++){
			BigInteger a = new BigInteger(s.next());
			BigInteger b = new BigInteger(s.next());
			BigInteger c = a.add(b);
			String d = c.toString();
			if(d.length()>80)
				System.out.println("overflow");
			else
				System.out.println(c);
		}
    }
}