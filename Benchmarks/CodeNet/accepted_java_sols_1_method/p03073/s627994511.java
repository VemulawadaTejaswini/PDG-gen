import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int n = s.length;
		char zero = '0';
		char one = '1';
		// 0101...
		int t1 = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				if (s[i] != zero) {
					t1++;
				}
			} else {
				if (s[i] != one) {
					t1++;
				}
			}
		}
		int t2 = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				if (s[i] != one) {
					t2++;
				}
			} else {
				if (s[i] != zero) {
					t2++;
				}
			}
		}
		System.out.println(Math.min(t1, t2));
	}
}

 
 

 
 
 
 
