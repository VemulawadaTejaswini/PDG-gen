import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.next();
		String o = (s.length() <= k) ? s : s.substring(0, k) + "...";
		System.out.println(o);
	}

}
