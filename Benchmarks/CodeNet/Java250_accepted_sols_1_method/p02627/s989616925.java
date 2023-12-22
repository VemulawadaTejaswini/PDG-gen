import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			char[] n = sc.next().toCharArray();
			String ans = "a";

			if (Character.isUpperCase(n[0])) {

				ans = "A";
			}
			System.out.println(ans);


		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
