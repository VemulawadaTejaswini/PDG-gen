
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		String ans = "WA";
		if (s.charAt(0) == 'A') {
			int count = 0;
			int index = 0;
			for (int i = 2; i < s.length() - 1; i++) {
				if (s.charAt(i) == 'C') {
					count++;
					index = i;
				}
			}
			if (count == 1) {
				boolean flg = true; 
				for (int i = 1; i < s.length(); i++) {
					if (i == index) {
						continue;
					}
					
					if (Character.isUpperCase(s.charAt(i))) {
						flg = false;
						break;
					}
					
				}
				if (flg) {
					ans ="AC";
				}
			}
		}
		System.out.println(ans);
	}
}