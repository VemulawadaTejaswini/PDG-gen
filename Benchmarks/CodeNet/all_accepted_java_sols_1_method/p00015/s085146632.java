import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="1";
		for(int i=0;i<80;i++)	s+="0";
		BigInteger out=new BigInteger(s);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			BigInteger a=new BigInteger(sc.next());
			BigInteger b=new BigInteger(sc.next());
			a=a.add(b);
			if(a.min(out).equals(out))	System.out.println("overflow");
			else 	System.out.println(a.toString());
		}
		sc.close();
	}

}