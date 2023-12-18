import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		String str = sc.nextLine();
		String str2 = "";
		for (;;) {
			str2 = "";
			for (char c : str.toCharArray()) {
				
				if (c >= 'a' && c < 'z') {
					c++;
				} else if (c == 'z') {
					c = 'a';
				}
				str2 += c;
			}
			str = new String(str2);
			if (str.contains("this")) {
				if (str.contains("the")) {
					if (str.contains("that")) {
						break;
					}
				}
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}