import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String t = in.nextLine();
		for(int i = 0; i < t.length(); i++) {
			String tmp = s.substring(i) + s.substring(0, i);
			if(tmp.equals(t)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}