import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
		
		double N=n;
		double X=x;
		double T=t;
		
		 double res=0.0;
		if(N<X)
			res=T;
		else
		{
			res=Math.ceil(N/X);
			res=res*T;
		}
		System.out.println((int)res);
	}

}