import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力
	String c = sca.next();
	char d = c.charAt(0);

	System.out.println((char)(d + 1));

	// 後始末
	sca.close();
	}
}