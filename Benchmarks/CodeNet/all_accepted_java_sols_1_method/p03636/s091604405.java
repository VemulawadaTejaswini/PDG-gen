import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Character> list = new ArrayList<Character>();
		String str = scan.nextLine();
		int n = 0;
		for (n = 0; n < str.length(); n++) {
			list.add(str.charAt(n));
		}
		System.out.print(list.get(0));
		System.out.print(list.size()-2);
		System.out.println(list.get(n-1));
		scan.close();
	}

}