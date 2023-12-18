import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char text[] = str.toCharArray();  //配列に変換
		int n = sc.nextInt();
		char temp;  //この場所でいいのか？？

		for(int i = 0; i < n; i++) {
			String com = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(com.equals("print")) {
				for(int j = a; j <= b; j++) {
					System.out.print(text[j]);
				}
				System.out.println();
			}
			else if(com.equals("reverse")) {
				//b-aの偶奇で場合分け
				if((b - a) % 2 == 0) {
					for(int j = a; j <= (a + b) / 2 - 1; j++) {
						temp = text[j];
						text[j] = text[a + b - j];
						text[a + b - j] = temp;
					}
				}
				else {
					for(int j = a; j <= (a + b - 1) / 2; j++) {
						temp = text[j];
						text[j] = text[a + b - j];
						text[a + b - j] = temp;
					}
				}
			}
			else if(com.equals("replace")) {
				String rep = sc.next();
				char text2[] = rep.toCharArray();
				for(int j = a; j <=  b; j++) {
					text[j] = text2[j-a];
				}
			}
		}

	}

}
