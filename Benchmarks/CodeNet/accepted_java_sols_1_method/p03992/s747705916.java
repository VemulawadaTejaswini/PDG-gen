import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String s1 = s.substring(0, 4);
		String s2 = s.substring(4, s.length());
		System.out.println(s1 + " " + s2);
	}

}
