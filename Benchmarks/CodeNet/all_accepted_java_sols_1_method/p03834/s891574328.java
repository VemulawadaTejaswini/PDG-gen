import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();

		String sub1 = s.substring(0, 5);
		String sub2 = s.substring(6, 13);
		String sub3 = s.substring(14, 19);

//		System.out.println(sub1);
//		System.out.println(sub2);
//		System.out.println(sub3);

		System.out.println(sub1 + " " + sub2 + " " + sub3);
	}

}