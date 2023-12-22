import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		for(int i = 0; i < 2; i++) {
			if(!S.substring(i + 1, i + 2).equals(S.substring(i, i + 1))) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
