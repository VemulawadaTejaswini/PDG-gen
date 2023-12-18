import java.util.*;
public class Main {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(sc.nextLine());	// 1..10^4
			if (n==0) break;
			int t[] = new int[86400];
			for (int i=0; i<n; i++) {
				String ge = sc.nextLine();
				t[Integer.parseInt(ge.substring(0,2))*3600 + 
				  Integer.parseInt(ge.substring(3,5))*60 + 
				  Integer.parseInt(ge.substring(6,8))] ++;
				t[Integer.parseInt(ge.substring(9,11))*3600 + 
				  Integer.parseInt(ge.substring(12,14))*60 + 
				  Integer.parseInt(ge.substring(15,17))] --;
			}
			
			int ans = 0;
			int cnt = 0;
			for (int i=0; i<86400; i++) {
				if (t[i]!=0) cnt += t[i];
				if (cnt>ans) ans = cnt;
			}
			
			System.out.println(ans);
			
		}
		
	}
}