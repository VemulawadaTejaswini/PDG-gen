import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			int ans = sorv(n);
			System.out.println(ans);
		}
		
	}
	
	public static int sorv(int n) {
		int c1 = sa(1,0,0,n - 200);
		int c2 = sb(0,1,0,n - 300);
		int c3 = sc(0,0,1,n - 500);
		
		int ans = c1;
		if (ans > c2) ans = c2;
		if (ans > c3) ans = c3;
		return ans;
	}
	
	public static int sa(int a, int b, int c, int las) {
		if(las < 0) return 999999999;
		if(las == 0 && a % 5 == 0) return 380 - (int)(380 * 5 * 0.2);
		if(las == 0) return 380;
		int c1 = sa(a+1,b,c,las - 200);
		int c2 = sb(a,b+1,c,las - 300);
		int c3 = sc(a,b,c+1,las - 500);
		if(a+1 % 5 == 0) c1 += 380 - (int)(380 * 5 * 0.2);
		int ans = c1;
		if(ans > c2) ans = c2;
		if(ans > c3) ans = c3;
		if(a % 5 == 0) ans += 380 - (int)(380 * 5 * 0.2);
		else ans += 380;
		return ans;
	}
	public static int sb(int a, int b, int c, int las) {
		if(las < 0) return 999999999;
		if(las == 0 && b % 4 == 0) return 550 - (int)(550 * 4 * 0.15);
		if(las == 0) return 550;
		int c1 = sa(a+1,b,c,las - 200);
		int c2 = sb(a,b+1,c,las - 300);
		int c3 = sc(a,b,c+1,las - 500);
		int ans = c1;
		if(ans > c2) ans = c2;
		if(ans > c3) ans = c3;
		if(b % 4 == 0) ans += 550 - (int)(550 * 4 * 0.15);
		else ans += 550;
		return ans;
		
	}
	
	public static int sc(int a, int b, int c, int las) {
		if(las < 0) return 999999999;
		if(las == 0 && c % 3 == 0) return 850 - (int)(850 * 3 * 0.12);
		if(las == 0) return 850;
		int c1 = sa(a+1,b,c,las - 200);
		int c2 = sb(a,b+1,c,las - 300);
		int c3 = sc(a,b,c+1,las - 500);
		int ans = c1;
		if(ans > c2) ans = c2;
		if(ans > c3) ans = c3;
		if(c % 3 == 0) ans += 850 - (int)(850 * 3 * 0.12);
		else ans += 850;
		return ans;
	}
}