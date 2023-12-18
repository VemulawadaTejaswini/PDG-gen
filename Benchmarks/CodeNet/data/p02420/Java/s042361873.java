import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		while(true) {

			String text = sc.next();

			if(text.equals("-")) break;

			int m = sc.nextInt();
			int h[] = new int[m];
			char c[] = text.toCharArray();
			char temp;

			for(int i = 0; i < m; i++) {
				h[i] = sc.nextInt();
			}

			for(int i = 0; i < m; i++) {
				for(int j = 0; j < h[i]; j++) {
					temp = c[0];
					for(int k = 0; k < c.length-1; k++) {
						c[k] = c[k+1];
					}
					c[c.length - 1] = temp;
				}
			}
			System.out.println(c);
		}
	}

}

