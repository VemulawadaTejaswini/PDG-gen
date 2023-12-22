import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = scan.next();
		sb.append(s);
		sb.reverse();
		//System.out.println(sb);
		if(s.equals(sb.toString())) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
