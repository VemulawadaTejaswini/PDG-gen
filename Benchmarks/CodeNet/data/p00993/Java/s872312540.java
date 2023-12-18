import java.util.*;
import java.math.*;
class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		BigInteger bi=new BigInteger("1");
		for(int i=0;i<a;i++)bi=bi.multiply(new BigInteger(""+(i+2)));
		bi=bi.add(new BigInteger("2"));
		System.out.println(bi.toString());
		for(int i=0;i<a;i++)System.out.println(2+i);
	}
}