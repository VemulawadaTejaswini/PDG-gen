import java.util.*;
import java.math.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=0;i<a;i++){
			BigInteger b=s.nextBigInteger();
			BigInteger c=s.nextBigInteger();
			BigInteger d=b.add(c);
			if(d.compareTo(new BigInteger("99999999999999999999999999999999999999999999999999999999999999999999999999999999"))==1)System.out.println("overflow");
			else System.out.println(d.toString());
		}
	}
}