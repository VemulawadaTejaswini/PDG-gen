import java.util.*;
import java.math.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			BigInteger a=in.nextBigInteger();
			BigInteger b=in.nextBigInteger();
			String ans=a.add(b).toString();
			if(ans.length()>80)System.out.println("overflow");
			else System.out.println(ans);
		}
		in.close();
	}
}