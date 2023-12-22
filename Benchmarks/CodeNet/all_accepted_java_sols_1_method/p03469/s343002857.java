import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		if(S.matches("2017.*")) {
			System.out.println(S.replace("2017", "2018"));
		}
		else{
			System.out.println(S);
		}
	}
}
