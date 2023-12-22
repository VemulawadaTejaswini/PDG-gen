
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length() == 12) System.out.println(s.substring(0, 4) + " " + s.substring(4, 12));

	}

}