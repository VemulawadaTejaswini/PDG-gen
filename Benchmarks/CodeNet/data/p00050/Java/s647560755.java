import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = sc.nextLine();
		sc.nextLine();
		s = s.replace("apple","A");
		s = s.replace("peach","apple");
		s = s.replace("A","peach");
		out.println(s);
	}
}
