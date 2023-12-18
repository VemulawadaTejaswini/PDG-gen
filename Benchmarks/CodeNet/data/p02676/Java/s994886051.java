import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = Integer.parseInt(in.nextLine());
		String s = in.nextLine();
		if(s.length() > k) {
			String mod_s = s.substring(0,k) + "...";
			System.out.println(mod_s);
		} else {
			System.out.println(s);
		}
	}
}