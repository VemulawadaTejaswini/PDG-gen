import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.nextLine();
			String ans  = "s";
			if (S.endsWith("s")) {
				ans = "es";
			}

           System.out.println(S.concat(ans));

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}