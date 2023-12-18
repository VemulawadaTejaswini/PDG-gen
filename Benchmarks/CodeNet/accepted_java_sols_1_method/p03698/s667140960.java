
import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		List<String> SListA = new ArrayList<String>();
		for(int i = 0; i < S.length(); i++) {
			SListA.add(S.substring(i, i + 1));
		}
		List<String> SListB = new ArrayList<String>(new HashSet<>(SListA));
		System.out.println(SListA.size() == SListB.size() ? "yes" : "no");
		scan.close();
	}

}
