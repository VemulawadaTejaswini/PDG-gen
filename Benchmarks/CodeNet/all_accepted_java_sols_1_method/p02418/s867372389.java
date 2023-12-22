import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String p = in.nextLine();
		s += s;
		if(s.indexOf(p) != -1) System.out.println("Yes");
		else System.out.println("No");
	}
}