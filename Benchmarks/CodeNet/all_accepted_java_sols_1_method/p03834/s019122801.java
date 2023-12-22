import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.setCharAt(5, ' ');
		sb.setCharAt(13, ' ');
		System.out.println(sb);
	}

}
