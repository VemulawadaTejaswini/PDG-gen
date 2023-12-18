
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n,ans;
		while((n = scn.nextInt())!= 0) {
			n /=100;
			ans = 100000000;
			for(int c = 0;c <= n/5;c++) {
				for(int b = 0;b <= (n-5*c)/3;b++) {
					if((n - (5*c + 3*b))%2 == 0){
						int a = (n-(5*c + 3*b))/2;
						ans = (int)Math.min(a/5*380*0.8*5 + a%5*380 + b/4*550*0.85*4+b%4*550+c/3*850*0.88*3+c%3*850,ans);
					}else {
						continue;
					}
				}
			}
			System.out.println(ans);
		}
		scn.close();
	}
}

