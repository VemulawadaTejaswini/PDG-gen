import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count1 = 0;//1010...
		int count2 = 0;//0101...
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				if (s.charAt(i) == '0') {
					count1++;
				} else {
					count2++;
				}
			} else {
				if (s.charAt(i) == '1') {
					count1++;
				} else {
					count2++;
				}
			}
		}
		System.out.println(Math.min(count1, count2));
	}
}