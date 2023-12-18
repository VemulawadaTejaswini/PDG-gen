import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		int p = sc.nextInt();
		String t = sc.next();
		sc.close();

		HashMap<String, Integer> points = new HashMap<String, Integer>();
		points.put("r", p);
		points.put("s", r);
		points.put("p", s);
		List<String> texts = new ArrayList<String>();
		long point = 0L;
		for (int i = 0; i < n; i++) {
			String text1 = t.substring(i, i + 1);
			if (i >= k && texts.get(i - k).equals(text1)) {
				text1 = "";
			}
			texts.add(text1);
			if (!text1.equals("")) {
				point += points.get(text1);
			}
		}
		System.out.println(point);
	}
}
