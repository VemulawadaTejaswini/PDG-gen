import java.util.Scanner;


public class Main {
	int firstCheck(char c) {
		if (c == '(') return 1;
		if (c == '[') return 2;
		return 0;
	}
	int lastCheck(char c) {
		if (c == ')') return 1;
		if (c == ']') return 2;
		return 0;
	}
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = scan.nextLine();
			if (str.equals(".")) break;
			if (str.charAt(str.length() - 1) != '.') {
				do {
					str += scan.nextLine();
				} while(str.charAt(str.length() - 1) != '.');
			}
			char[] array = str.toCharArray();
			int[] brackets = new int[50];
			int lastindex = 0;
			boolean flag = false;
			for (int i = 0; i < array.length; i++) {
				int check = firstCheck(array[i]);
				if (check == 1 || check == 2) {
					brackets[lastindex] = check;
					lastindex++;
					continue;
				}
				check = lastCheck(array[i]);
				if (check == 1 || check == 2) {
					if (lastindex == 0) {
						flag = true;
						break;
					}
					if (brackets[lastindex - 1] == check) {
						brackets[lastindex - 1] = 0;
						lastindex--;
					} else {
						flag = true;
						break;
					}
				}
			}
			if (flag) System.out.println("no");
			else System.out.println("yes");
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}