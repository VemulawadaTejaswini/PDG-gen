import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		int n = Integer.parseInt(s.substring(0, 1));
		for (int i=0; i<s.length()-2; i++) {
			if (Math.abs(Integer.parseInt(s.substring(i, i+3))-753)<Math.abs(n-753)) {
				n = Integer.parseInt(s.substring(i, i+3));
			}
		}

		System.out.println(Math.abs(n-753));
	}

}
