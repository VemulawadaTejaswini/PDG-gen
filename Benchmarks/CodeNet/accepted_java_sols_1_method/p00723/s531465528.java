import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = Integer.parseInt(sc.next());
		for (int i = 0; i < m; i++) {
			String s = sc.next();
			ArrayList<String> a = new ArrayList<>();
			for (int j = 0; j < s.length(); j++) {
				a.add(s.substring(0, j) + s.substring(j));
				a.add(s.substring(j) + s.substring(0, j));
				a.add(new StringBuilder(s.substring(0, j)).reverse().toString() + s.substring(j));
				a.add(s.substring(0, j) + new StringBuilder(s.substring(j)).reverse().toString());
				a.add(new StringBuilder(s.substring(j)).reverse().toString() + s.substring(0, j));
				a.add(s.substring(j) + new StringBuilder(s.substring(0, j)).reverse().toString());
				a.add(new StringBuilder(s.substring(0, j)).reverse().toString() + new StringBuilder(s.substring(j)).reverse().toString());
				a.add(new StringBuilder(s.substring(j)).reverse().toString() + new StringBuilder(s.substring(0, j)).reverse().toString());
			}
			System.out.println(new ArrayList<String>(new HashSet<>(a)).size());
		}
	}
}
