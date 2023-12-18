import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		int max = 0;
		int submax = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i)=='R') {
				submax++;
			}else {
				if (max<submax) {
					max = submax;
					submax = 0;
				}
			}
		}
		if (max<submax) {
			System.out.println(submax);
		}else {
			System.out.println(max);
		}
		
	}

}