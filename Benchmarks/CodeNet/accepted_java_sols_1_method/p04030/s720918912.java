import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] cs = sc.next().toCharArray();
		for(char c :cs) {
			switch(c) {
			case '1': sb.append(c);
			break;
			case '0': sb.append(c);
			break;
			case 'B':
				if (sb.length() > 0) {
					sb.deleteCharAt(sb.length() - 1);
				}
			break;
			}
		}
		System.out.println(sb);

	}

}
