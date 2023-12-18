import java.util.Scanner;

public class Main {
	static int check(boolean[] c, int index) {
		for (int i = index; i < c.length; i++) {
			if (c[i]) {
				return i;
			}
		}
		
		return -1;
	}
	
	static int check2(boolean[] c, int index) {
		for (int i = c.length - 1; i > index; i--) {
			if (!c[i] && c[i - 1]) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] c = new boolean[n];
		String str = sc.next();
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == 'W') {
				c[i] = true;
			}
		}
		
		int index = 0;
		int index2 = 0;
		
		int count = 0;
		
		while ((index = check2(c, index2)) > (index2 = check(c, index2)) && index2 >= 0) {
			c[index] = true;
			c[index2] = false;
			++count;
		}
		
		for (int i = c.length - 1; i > 0; i--) {
			if (!c[i] && c[i - 1]) {
				++count;
				c[i - 1] = false;
			}
		}
		System.out.println(count);
	}
}
