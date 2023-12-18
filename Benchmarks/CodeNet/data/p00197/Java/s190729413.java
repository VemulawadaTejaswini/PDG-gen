import java.util.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int x,y;
	
	static boolean read() {
		x = sc.nextInt(); 
		y = sc.nextInt();
		return ((x == 0) && (y == 0)) ? false : true;
	}
	
	static void solve() {
		int step = 0, tmp;
		while(y > 0) {
			x = x % y;
			tmp = x;
			x = y;
			y = tmp;
			step++;
		}
		System.out.println("" + x + " " + step);
	}
	
	public static void main(String[] args) {
		while(read()) {
			solve();
		}
	}

}