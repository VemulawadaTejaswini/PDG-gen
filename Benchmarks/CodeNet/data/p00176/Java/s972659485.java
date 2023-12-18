/**
 * @author yuichirw
 *
 */
import java.util.*;
import static java.lang.Math.*;

public class Main {
	static String c;
	static Scanner sc = new Scanner(System.in);
	static String[] color_str = {
		"black", "blue", "lime", "aqua", "red", "fuchsia", "yellow", "white"
	};
	static int[][] color = {
		{0, 0, 0},
		{0, 0, 255},
		{0, 255, 0},
		{0, 255, 255},
		{255, 0, 0},
		{255, 0, 255},
		{255, 255, 0},
		{255, 255, 255}
	};
	
	static boolean read() {
		c = sc.next();
		return (c.equals("0")) ? false : true;
	}
	
	static String solve() {
		int[] clr = new int[3];
		clr[0] = Integer.parseInt(c.substring(1, 1 + 2), 16);
		clr[1] = Integer.parseInt(c.substring(3, 3 + 2), 16);
		clr[2] = Integer.parseInt(c.substring(5, 5 + 2), 16);
		
		String ans; int d, a;
		ans = ""; d = 195075;
		
		for(int i = 0; i < color.length; i++) {
			a = (int)(pow(color[i][0] - clr[0], 2) + pow(color[i][1] - clr[1], 2) + pow(color[i][2] - clr[2], 2));
			if(a < d) {
				d = a;
				ans = color_str[i];
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}

}