import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = sc.next();
		s += s;
		String p = sc.next();
		System.out.println(s.contains(p)==true?"Yes":"No");
	}
}
