import java.util.*;
import java.math.*;

class Main{
	static void dump(String s){
		System.out.println(s);
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++){
			BigInteger a=scanner.nextBigInteger();
			BigInteger b=scanner.nextBigInteger();
			BigInteger c=a.add(b);
			String res=c.toString();
			if(res.length()>80)
				dump("overflow");
			else
				dump(res);
		}
	}
}