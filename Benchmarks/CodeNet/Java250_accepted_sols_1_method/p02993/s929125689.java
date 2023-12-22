import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String pre = s.substring(0, 1);
		for(int i = 1; i < 4; i++) {
			if(s.substring(i, i + 1).equals(pre)) {
				System.out.println("Bad");
				return;
			} else {
				pre = s.substring(i, i + 1);
			}
		}
		System.out.println("Good");
	}
}
