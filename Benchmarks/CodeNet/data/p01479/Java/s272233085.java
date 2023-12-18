import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char[] str = sc.next().toCharArray();
		ArrayList<ArrayList<Boolean>> statements = new ArrayList<ArrayList<Boolean>>();
		ArrayList<Boolean> statement = new ArrayList<Boolean>();
		int maxLen = 0;
		for (int i = 0; i < str.length;) {
			boolean next = str[i] == 'c';
			if (!statement.isEmpty() && statement.get(statement.size() - 1) == next) {
				statements.add(statement);
				maxLen = Math.max(maxLen, statement.size());
				statement = new ArrayList<Boolean>();
			}
			statement.add(next);
			i += next ? 7 : 3;
		}
		statements.add(statement);
		maxLen = Math.max(maxLen, statement.size());
		for (ArrayList<Boolean> st : statements) {
			if (st.size() == maxLen) {
				System.out.println(st.get(maxLen - 1) ? "chicken" : "egg");
				break;
			}
		}
	}
}