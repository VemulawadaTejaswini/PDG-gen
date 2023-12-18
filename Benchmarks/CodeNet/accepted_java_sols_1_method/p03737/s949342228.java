import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		String s3 = scan.next();
		String s = String.valueOf(s1.charAt(0))+String.valueOf(s2.charAt(0))+String.valueOf(s3.charAt(0));
		System.out.println(s.toUpperCase());
	}

}
