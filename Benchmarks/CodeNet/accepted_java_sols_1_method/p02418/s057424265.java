import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String p = scan.nextLine();
		s += s;
		int check = s.indexOf(p);
		if (check != -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}