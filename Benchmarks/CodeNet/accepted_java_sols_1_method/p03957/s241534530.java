import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = s.indexOf("C");
		int j = s.lastIndexOf("F");
		System.out.println((i >= 0 && j >= 0 && i < j) ? "Yes" : "No");
	}

}
