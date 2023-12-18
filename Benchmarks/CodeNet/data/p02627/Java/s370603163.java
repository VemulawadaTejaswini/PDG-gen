import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] s1 = s.toCharArray();
		if(Character.isUpperCase(s1[0])) {
			System.out.print("A");
		}else {
			System.out.print("a");
		}

	}

}
