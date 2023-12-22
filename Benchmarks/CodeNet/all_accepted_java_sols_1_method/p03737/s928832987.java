import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 'a' - 'A';

		char s_1, s_2, s_3;

		s_1 = sc.next().charAt(0);
		s_2 = sc.next().charAt(0);
		s_3 = sc.next().charAt(0);

		sc.close();

		String ans = "";

		ans += (char)(s_1-num);
		ans += (char)(s_2-num);
		ans += (char)(s_3-num);



		System.out.println(ans);

	}

}
