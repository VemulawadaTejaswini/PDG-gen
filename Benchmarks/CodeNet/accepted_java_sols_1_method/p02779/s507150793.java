import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String k = "YES";
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int j = kb.nextInt();
			a.add(j);
		}
		Collections.sort(a);
		//System.out.println(a.get(0));
		//System.out.println(a.get(1));
		for (int i = 0; i < n - 1; i++) {
			//System.out.println(i);
			//System.out.println(a.get(i).equals(a.get(i + 1)));
			if (a.get(i).equals(a.get(i + 1))) {
				k = "NO";
				break;
			}
		}
		System.out.println(k);
		kb.close();
	}
}
