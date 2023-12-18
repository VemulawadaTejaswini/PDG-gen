
import java.util.Scanner;

public class Main{
	
	static int mod = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int []a = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		int []cnt = new int [n+1];
		
		cnt[0] = 3;
		long ans = 1;
		
		for(int i = 0 ; i < n ;i++) {
			int num = a[i];
			ans = (ans * (cnt[num] - cnt[num+1])% mod); 
			cnt[num+1]++;
		}
		
		System.out.println(ans);
		

	}

}
