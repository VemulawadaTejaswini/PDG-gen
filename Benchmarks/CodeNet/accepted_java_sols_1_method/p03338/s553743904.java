import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();

		int max = 0;

		for (int i = 1; i < s.length() - 1; i++) {
			HashSet<Character> s1 = new HashSet<Character>();
			for (Character c : s.substring(0, i).toCharArray()) {
				s1.add(c);
			}
			HashSet<Character> s2 = new HashSet<Character>();
			for (Character c : s.substring(i).toCharArray()) {
				s2.add(c);
			}
			int mc = 0;
			for (Character c1 : s1) {
				for (Character c2 : s2) {
					if (c1 == c2)
						mc++;
				}
			}
			max = Math.max(max, mc);
		}

		System.out.println(max);

	}

}
