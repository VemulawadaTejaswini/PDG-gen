import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String str = "abcdefghijklmnopqrstuvwxyz";

		Scanner sc = new Scanner(System.in);

		String tmp = sc.next();

		int a = str.indexOf(tmp);
		tmp = str.substring(a+1,a+2);

		System.out.println(tmp);

	}
}
