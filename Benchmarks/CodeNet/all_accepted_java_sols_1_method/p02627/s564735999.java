import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		String check = "abcdefghijklmnopqrstuvwxyz";

		if(check.contains(S)) {
			System.out.println("a");
		}else {
			System.out.println("A");
		}
	}


}