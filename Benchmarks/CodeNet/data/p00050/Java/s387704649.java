import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = sc.next();
		s = s.replaceAll("apple","A");
		s = s.replaceAll("peach","apple");
		s = s.replaceAll("A","peach");
		out.println(s);
	}
}
