import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		System.out.println(S.replace("2017", "2018"));
		sc.close();
	}
}