import java.util.Scanner;

public class Main {
	int firstcheck(char c) {
		if (c == '(') return 1;
		if (c == '[') return 2;
		return 0;
	}
	int lastcheck(char c) {
		if (c == ')') return 1;
		if (c == ']') return 2;
		return 0;
	}
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = scan.nextLine();
			if (str.equals(".")) break;
			char[] c = str.toCharArray();
			int[] array = new int[50];
			int lastindex = 0;
			boolean flag = false;
			for (int i = 0; i < c.length; i++) {
				int f_check = firstcheck(c[i]);
				if (f_check == 1 || f_check == 2) {
					array[lastindex] = f_check;
					lastindex++;
					continue;
				}
				int l_check = lastcheck(c[i]);
				if (l_check == 1 || l_check == 2) {
					if (lastindex == 0) {
						flag = true;
						break;
					}
					if(array[lastindex - 1] != l_check) {
						flag = true;
						break;
					} else {
						lastindex--;
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