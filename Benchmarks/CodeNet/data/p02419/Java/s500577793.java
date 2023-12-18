import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W = sc.next();
		String T;
		int count = 0;
		ArrayList<String> lowerT = new ArrayList<String>();
		;
		while (true) {
			T = sc.next();
			if (T.equals("END_OF_TEXT")) {
				break;
			}
			lowerT.add(T.toLowerCase());
		}
		for (int i = 0; i < lowerT.size(); i++) {
			if (W.equals(lowerT.get(i))) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
