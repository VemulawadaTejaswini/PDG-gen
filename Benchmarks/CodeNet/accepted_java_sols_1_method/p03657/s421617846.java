import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		String ans = "";

		if (A % 3  == 0 || B % 3 == 0 || (A+B)%3 ==0 ) {
			ans = "Possible";
		}else {
			ans = "Impossible";
		}
		System.out.println(ans);
	}
}