import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		s = s.replace("2017", "2018");
		System.out.println(s);
	}
}
