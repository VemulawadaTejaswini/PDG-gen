import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();

		System.out.println( s+(s.endsWith("s") ? "es" : "s"));
	}
}
