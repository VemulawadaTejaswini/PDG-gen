
import java.util.Scanner;

public class Main {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int n = s.length();
		
		int []a = new int [n];
		
		for(int i = n-1 ;i >= 0 ;i--) {
			a[n-i-1] = (s.charAt(i) - '0');
		}
		
		int []p = new int [n];
		
		p[0] = 1;
		for(int i = 1; i < n;i++) {
			p[i] = (p[i-1] * 10)%2019;
		}
		
		int []sum = new int [n+1];
		int []cnt = new int [2020];
		
		cnt[sum[0]]++;

		for(int i = 0 ; i < n;i++) {
			sum[i+1] = (sum[i] + a[i]*p[i])%2019;
			cnt[sum[i+1]]++;
		}
		
		int q = 0;
		
		for(int i =0 ; i < 2020 ;i++) {
			q += ((cnt[i]-1)*cnt[i])/2;
		}
		
		System.out.println(q);
		
	}
	}


