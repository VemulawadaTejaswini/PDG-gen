import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String W = sc.nextLine();
		W = W.toLowerCase();
		
		List<String> T = new ArrayList<String>();

		String line = sc.next();
		while (!"END_OF_TEXT".equals(line)) {
			T.add(line.toLowerCase());
			line = sc.next();
		}
		int cnt = 0;
		for (int i = 0; i < T.size(); i++) {
			if (T.get(i).equals(W)) cnt++;
		}
		System.out.println(cnt);
	}
}

