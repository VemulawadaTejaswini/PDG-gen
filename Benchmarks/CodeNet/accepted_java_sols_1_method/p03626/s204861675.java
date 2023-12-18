import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S1 = sc.next();
		String S2 = sc.next();
		sc.close();
		
		int mod = (int)1e9+7;
		
		long ans = 0;
		boolean before_vertical = false;
		for(int i=0;i<N;i++) {
			if(S1.charAt(i)==S2.charAt(i)) {
				//縦置き
				if(i==0) {
					ans = 3;
				}else {
					if(before_vertical) {
						ans *= 2;
						ans %= mod;
					}else {
						ans *= 1;
						ans %= mod;
					}
					
				}
				
				before_vertical = true;
				
			}else {
				//横置き
				if(i==0) {
					ans = 6;
				}else {
					if(before_vertical) {
						ans *= 2;
						ans %= mod;
					}else {
						ans *= 3;
						ans %= mod;
					}
				}
				before_vertical = false;
				i++;
			}
		}
		System.out.println(ans);
	}
}
