
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		String []s = new String [n];
		int []t = new int [n];
		int sum[] = new int [n+1];
		
		sum[0] = 0;
		
		for(int i = 0 ;i < n ;i++) {
			s[i] = sc.next();
			t[i] = Integer.parseInt(sc.next());
			sum[i+1] += t[i] + sum[i];
		}
		
		String x = sc.next();
		int ans = 0;
		
		for(int i = 0 ;i < n ;i++) {
			if(s[i].equals(x)) {
				ans = sum[n] - sum[i+1];
				break;
			}
		}
		
		System.out.println(ans);

	}

}
