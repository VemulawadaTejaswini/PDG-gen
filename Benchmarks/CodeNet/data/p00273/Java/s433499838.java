import java.io.*;
import java.math.*;
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		int n;
		int x,y,b,p;
		double salex,saley;
		double saleans,ans;
		n = r.nextInt();
		while(true){
			x = r.nextInt();
			y = r.nextInt();
			b = r.nextInt();
			p = r.nextInt();
			salex = (double)x * 0.8;
			saley = (double)y * 0.8;
			ans = x*b + y *p;
			if(b < 5) b =5;
			if(p < 2) p =2;
			saleans = salex*b + saley*p;
			System.out.println((int)Math.min(ans,saleans));
			n--;
			if(n == 0) break;
		}	
	}
}