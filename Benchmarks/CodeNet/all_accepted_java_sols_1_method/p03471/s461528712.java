import java.util.*;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // osatu
		int y = sc.nextInt(); // goukei
		int yukiti = 0;
		int higuti = 0;
		int noguti = 0;
		
		loop : for(int a = 0; a <= n; a++) {
			for(int b = 0; b <= n - a; b++ ) {
				for(int c = 0; c <= n - a - b; c++) {
					if(a + b + c == n && 10000* a + 5000*b + 1000*c == y) {
						yukiti = a;
						higuti = b;
						noguti = c;
						break loop;//ループ抜ける
					}
				}
			}
		}
		if(yukiti == 0 && higuti == 0 && noguti == 0) {
			yukiti = -1;
			higuti = -1;
			noguti = -1;
		}
		System.out.print(yukiti + " " + higuti + " " + noguti);
     }
}