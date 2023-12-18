
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		long m=scanner.nextLong();
		long n=scanner.nextLong();
		System.out.println(kpow(m,n));
	}

	private static long  kpow(long m, long n) {
		// TODO Auto-generated method stub
		long r=0,sum=1;
		while(n!=0){
			r=n%2;
			n=n/2;
			if(r==1)
				sum=(sum*m)%1000000007;
			m=(m*m)%1000000007;
		}
		return sum%1000000007;
	}

}

