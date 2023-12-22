
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		
		int start = s.indexOf("A");
		int end = s.lastIndexOf("Z");
		
		String papapa = s.substring(start, end + 1);
		System.out.println(papapa.length());
	}
}

