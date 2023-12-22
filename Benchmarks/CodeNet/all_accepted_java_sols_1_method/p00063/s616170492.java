import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count;
		
		count = 0;
		while (sc.hasNext()) {
			String str = sc.next();
			boolean flag = true;
			for (int i = 0; i < str.length() / 2 && flag; i++) {
				if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
					flag = false;
				}
			}
			if (flag) {
				count++;
			}
		}
		System.out.println(count);
	}
}