import java.util.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static long x,y;
	
	static boolean read() {
		x = sc.nextLong(); 
		y = sc.nextLong();
		return ((x == 0) && (y == 0)) ? false : true;
	}
	
	static void solve() {
		long step = 0, tmp;
		do {
			x = x % y;
			tmp = x;
			x = y;
			y = tmp;
			step++;
		}while(y > 0);
		System.out.println("" + x + " " + step);
	}
	
	public static void main(String[] args) {
		while(read()) {
			solve();
		}
	}

}