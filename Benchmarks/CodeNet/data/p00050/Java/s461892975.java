import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = sc.nextLine();
		s = s.replaceAll("apple","AAAAA");
		s = s.replaceAll("peach","apple");
		s = s.replaceAll("AAAAA","peach");
		out.println(s);
	}
}
