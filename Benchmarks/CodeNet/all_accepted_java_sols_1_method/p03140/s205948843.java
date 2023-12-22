import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		// 標準入力
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		String c = scanner.nextLine();

		int nInt = Integer.parseInt(n);

		int count = 0;

		for (int i=0; i<nInt; i++) {
			char charA = a.charAt(i);
			char charB = b.charAt(i);
			char charC = c.charAt(i);

			List<Character> listA = new ArrayList<Character>(Arrays.asList(charA, charB, charC));
	        List<Character> listB = new ArrayList<Character>(new HashSet<>(listA));

	        count += listB.size();
		}

		count -= nInt;

		System.out.println(count);

	}
}
