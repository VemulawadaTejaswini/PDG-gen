import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		// 整数の入力
		String a = sc.next();

		if (a.endsWith("s")) {
			System.out.println(a + "es");
		} else {
			System.out.println(a + "s");
		}


	}
}