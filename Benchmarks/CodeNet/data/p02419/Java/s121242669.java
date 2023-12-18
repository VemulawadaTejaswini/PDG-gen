import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String w = sc.next();
		int count = 0;
		while (sc.hasNext()) {
			String str = sc.next();
			if (str.equals("END_OF_TEXT")) {break;}
			else {
				if (str.equals(w)) {count++;}
			}
		}
		System.out.println(count);
	}
}
