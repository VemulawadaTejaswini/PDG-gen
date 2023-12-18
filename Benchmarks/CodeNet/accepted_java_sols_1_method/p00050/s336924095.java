import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	private static final Scanner S=new Scanner(System.in);
	private static final PrintStream O=System.out;
	
	public static void main(String[] args) {
		String s=S.nextLine().replace("apple", "p0p");
		s=s.replace("peach", "apple");
		s=s.replace("p0p", "peach");
		O.println(s);
	}
}