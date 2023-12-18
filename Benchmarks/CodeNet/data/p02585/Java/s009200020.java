import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int p[] = new int[n];
		int c[] = new int[n];
		int ANS = 0;
		int max_ans = 0;
		int now = 0;
		
		for(int i=0;i<n;i++) {
			p[i] = scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			c[i] = scan.nextInt();
			ANS += c[i];
		}
		
		for(int i=0;i<n;i++){
			int ans = 0;
			now = i;
			for(int j=0;j<k%n;j++) {
				ans += c[p[now]-1];
				now = p[now]-1;
			}
			
			if(i==0) {
				max_ans = ans;
			}else {
				max_ans = Math.max(ans, max_ans);
			}
		}
		
		if(k/n==0 || ANS < 0) {
			System.out.println(max_ans);
		}else {
			System.out.println(max_ans + (k/n)*ANS);
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
 



