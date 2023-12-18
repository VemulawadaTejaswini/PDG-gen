import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int res = 0;
		while (sc.hasNext()) {
			char[] c = sc.next().toCharArray();
			
			int tmp = 0;
			for (int i = 0; i < c.length; i++) {
				if ('0' <= c[i] && c[i] <= '9') {
					tmp *= 10;
					tmp += c[i] - '0';
				} else {
					res += tmp;
					tmp = 0;
				}
			}
			res += tmp;
		}
		
		System.out.println(res);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}