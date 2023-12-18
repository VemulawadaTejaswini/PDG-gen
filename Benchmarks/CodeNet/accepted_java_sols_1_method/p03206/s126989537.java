import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//String s = sc.next();
		String s = "Christmas";
		for(int i = 25 ; i > n ; i--) {
			s += " Eve";
		}

		System.out.println(s);

	}
}

