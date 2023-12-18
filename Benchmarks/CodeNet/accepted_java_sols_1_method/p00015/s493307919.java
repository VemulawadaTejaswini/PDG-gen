import java.math.*;
import java.util.*;

public class Main {
	public static void main(String []args){
		Scanner cin = new Scanner(System.in);
		BigInteger a,b,c;
		String s,ss,sss;
		int n = cin.nextInt();
		while(n-- != 0){
			a = cin.nextBigInteger();
			b = cin.nextBigInteger();
			
			s = a.toString();
			ss = b.toString();
			
			if(s.length()>80 || ss.length()>80){
				System.out.println("overflow");
				continue;
			}
			else {
				c = a.add(b);
				sss = c.toString();
				if(sss.length()>80){
					System.out.println("overflow");
					continue;
				}
				else System.out.println(c);
			}
		}
	}
}