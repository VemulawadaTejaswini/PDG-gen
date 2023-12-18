import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String p = scan.next();
		scan.close();
		int l1 = s.length();
		int l2 = p.length();
		char[] c = new char[l1];
		for(int i = 0; i < l1; i++) {
			c[i] = s.charAt(i);
		}
		for(int i = 0; i < l1; i++) {
			boolean flag = true;
			for(int j = 0; j < l2; j++) {
				int k = (i + j) % l1;
				if(c[k] != p.charAt(j)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}
}
