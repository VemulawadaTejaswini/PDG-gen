import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int ans[] = new int[n];
		

		for(int j=1;j<=100;j++) {
			for(int k=1;k<=100;k++) {
				for(int l=1;l<=100;l++) {
					int oppai =  (int)Math.pow(j, 2)+(int)Math.pow(k, 2)+(int)Math.pow(l, 2)+j*k+k*l+l*j;
					if(oppai <= n) {
						ans[oppai-1] ++;
					}
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(ans[i]);
		}
		
			

		
	}
	
	
	public static int gcd(int x,int y) {
		if(x%y == 0) {
			return y;
		}else {
			return gcd(y,x%y);
		}
	}
}
 
