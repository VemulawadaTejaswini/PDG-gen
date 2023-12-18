import java.util.*;
import java.math.*;
import java.text.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n=in.nextInt();
			if(n==0) break;
			int k=2, d=1, ans=1, a=n;
			while(n>k){
				d=1;
				int t=1;
				while(n%k==0){
					n=n/k;
					t=t*k;
					d=d+t;
				}
				k++;
				if(d!=1) ans=ans*d;
			}
			if(n!=1) ans = ans*(n+1);
			if(ans>a*2) System.out.println("abundant number");
			else if(ans==a*2) System.out.println("perfect number");
			else System.out.println("deficient number");
		}
	}
}