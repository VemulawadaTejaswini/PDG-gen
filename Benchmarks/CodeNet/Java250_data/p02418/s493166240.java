import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		char[] s = sc.next().toCharArray();
		char[] p = sc.next().toCharArray();
		
		boolean flag = false;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == p[0]) {
				flag = true;
				for (int j = 0; j < p.length; j++) {
					if (s[(i + j) % s.length] != p[j]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					break;
				}
			}
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}