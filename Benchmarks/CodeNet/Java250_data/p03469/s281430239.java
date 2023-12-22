import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String sub1 = s.substring(0, 3);
		String sub2 = s.substring(4, s.length());
		
		System.out.println(sub1+"8"+sub2);
	}
}