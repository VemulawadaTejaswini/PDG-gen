import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		
		for(int i = 0 ;i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		int cnt = 0;
		int []ans = new int [n];
		
		for(int i = n ;i >= 1 ;i--) {
			int temp = 0;
			for(int j = 2 ; j * i <= n; j++) {
				if(ans[j*i-1] == 1) {
					temp++;
				}
			}
			if(temp % 2 == a[i-1]) {
				continue;
			}
			else {
				cnt++;
				ans[i-1]++;
			}
		}
		
		System.out.println(cnt);
		for(int i = 0 ;i < n ;i ++) {
			if(ans[i] != 0) {
				System.out.println(i+1);
			}
		}
		
	}
}
