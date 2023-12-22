import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		Set<String> NS = new HashSet<String>();
		Set<String> WE = new HashSet<String>();
		for (char c: S.toCharArray()) {
			switch (c) {
			case 'N':
			case 'S':
				NS.add(String.valueOf(c));
				break;
			case 'W':
			case 'E':
				WE.add(String.valueOf(c));
				break;
			}
		}
		if (NS.size()==1 || WE.size()==1) System.out.println("No");
		else System.out.println("Yes");
		sc.close();
	}

}
