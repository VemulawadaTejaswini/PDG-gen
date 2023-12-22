
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i-1) == s.charAt(i)) {
				System.out.println("Bad");
				sc.close();
				return;
			}
		}
		System.out.println("Good");
		sc.close();
	}
}
