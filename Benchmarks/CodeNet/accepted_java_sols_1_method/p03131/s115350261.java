import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b||k<a+1||a>b-2) {
			System.out.println(k+1);
		}
		else {
			k=k-a+1;
			if(k%2==0) {
				BigInteger ans=new BigInteger(b+"");
				ans=ans.add(new BigInteger(k/2-1+"").multiply(new BigInteger(b-a+"")));
				//ans(k/2-1)*(b-a);
				System.out.println(ans);
			}
			else {
				BigInteger ans=new BigInteger(b+"");
				ans=ans.add(new BigInteger(k/2-1+"").multiply(new BigInteger(b-a+"")));
				ans=ans.add(BigInteger.ONE);
				System.out.println(ans);
			}

		}
	}
}
