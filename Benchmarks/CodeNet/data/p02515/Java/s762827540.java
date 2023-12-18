import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			String line = sc.nextLine();
			if (line.equals("#")) return;
			String[] clauses = line.split("\\|");
			boolean yes = false;
			OUT: for (String clause : clauses) {
				HashMap<Character, Integer> map = new HashMap<Character, Integer>();
				String[] literals = clause.substring(1, clause.length() - 1).split("&");
				for (String literal : literals) {
					int val = literal.length() == 1 ? 1 : -1;
					char key = literal.charAt(literal.length() - 1);
					if (map.containsKey(key)) {
						if (map.get(key) * val == -1) {
							continue OUT;
						}
					} else {
						map.put(key, val);
					}
				}
				yes = true;
			}
			System.out.println(yes ? "yes" : "no");
		}
	}

}