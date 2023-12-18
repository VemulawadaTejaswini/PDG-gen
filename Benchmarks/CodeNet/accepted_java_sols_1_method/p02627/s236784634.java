import java.util.Scanner;

public class Main {
	static int intN =0;
	static int sosuCnt =0;

	public static void main(String[] args) {
		//test
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = "a";
		if (Character.isUpperCase( s.charAt( 0 ) )) {
			result = "A";
		}

		System.out.println(result);
	}

}
