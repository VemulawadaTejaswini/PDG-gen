
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				break;
			}
			int[] s = new int[n];
			double a = 0;
			double ans = 0;
			for(int i=0;i<n;i++){
				s[i] = stdIn.nextInt();
				a += s[i];
			}
			a = a / n;
			for(int i=0;i<n;i++){
				ans += Math.pow(s[i]-a,2);
			}
		
		ans = ans/(double)n;
		System.out.println(Math.sqrt(ans));
		}
	}
}