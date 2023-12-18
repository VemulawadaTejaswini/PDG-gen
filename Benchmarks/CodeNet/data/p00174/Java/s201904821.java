/**
 * @author yuichirw
 *
 */
import java.util.*;

public class Main {
	static String game;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		game = sc.next();
		return (game.equals("0")) ? false : true;
	}
	
	static String solve() {
		int pa, pb;
		char s, sb;
		pa = pb = 0;
		sb = game.charAt(0);
		for(int i = 1; i < game.length(); i++) {
			s = game.charAt(i);
			if(s == 'A') {
				if(sb == 'A') {
					pa++;
				} else {
					pb++;
				}
			} else {
				if(sb == 'A') {
					pb++;
				} else {
					pa++;
				}
			}
		}
		if(pa > pb) {
			pa++;
		} else {
			pb++;
		}
		return "" + pa + " " + pb;
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}
}