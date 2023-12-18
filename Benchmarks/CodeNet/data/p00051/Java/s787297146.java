/**
 * @author yuichirw
 *
 */
import java.util.*;
import static java.util.Arrays.*;
public class Main {
	static int 		n;
	static char[] 	num;
	static Scanner 	sc = new Scanner(System.in);
	
	static boolean read() {
		num = sc.nextLine().toCharArray();
		return true;
	}
	
	static String solve() {
		sort(num);
		String max, min;
		max = ""; min = "";
		for(int i = 0; i < num.length; i++) {
			min += num[i];
			max += num[num.length - 1 - i];
		}
		return new Long(Long.parseLong(max) - Long.parseLong(min)).toString();		
	}
	
	public static void main(String[] args) {
		n = sc.nextInt(); sc.nextLine();
		while(n-- > 0 && read()) {
			System.out.println(solve());
		}
	}
}