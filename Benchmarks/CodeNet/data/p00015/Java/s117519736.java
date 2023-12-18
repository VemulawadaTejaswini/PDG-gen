
import java.math.BigInteger;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		for(int i =0;i<c;i++){
			String a = sc.next();
			String b = sc.next();
			if(a.length()>80||b.length()>80){
				System.out.println("overflow");
				continue;
			}
			BigInteger x = new BigInteger(a).add(new BigInteger(b));
			String str = x.toString();
			if(str.length()>80){
				System.out.println("overflow");
				continue;
			}
			System.out.println(x);
		}
		

		}
	}	