import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int n, m;
		n = stdin.nextInt();
		String[] Blue = new String[n];
		for (int i = 0; i < n; i++) {
			Blue[i] = stdin.next();
		}
		m = stdin.nextInt();
		String[] Red = new String[m];
		for (int i = 0; i < m; i++) {
			Red[i] = stdin.next();
		}
		int a = 0, b = 0, c, cmax = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (Blue[i].equals(Blue[j])) {
					a++;
				}
			}
			for (int k = 0; k < m; k++) {
				if (Blue[i].equals(Red[k])) {
					b++;
				}

			}
			c = a - b;
			a=0;b=0;
			if (c > cmax) {
				cmax = c;
			}
		}
		System.out.println(cmax);
	}
	

}