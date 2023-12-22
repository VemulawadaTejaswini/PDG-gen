import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt[] = new int[n] ;
		long ans = 1;
		for(int i = 0; i < n; i++)cnt[i] = 0; 
		for(int i = 0; i < n; i++) cnt[sc.nextInt()]++; 
		boolean key = true;
		int idx = 1;
		if(n % 2 != 0) {
			idx++;
			if(cnt[0] != 1) 	cnt[2] = 0;//key=falseと同義
			
		}
		while(idx < n) {
			if(cnt[idx] != 2) {
				key = false;
				break;
			}
			idx += 2;
		}
		if(key) {
			for(int i = 0; i < n / 2; i++) {
				ans = ans *  2 % 1000000007;
			}
		}
		else ans = 0;
		System.out.println(ans);
	}
}