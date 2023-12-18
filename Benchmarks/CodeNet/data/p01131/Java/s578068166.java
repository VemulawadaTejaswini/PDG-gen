import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static char[][] table = {{'.',',','!','?',' '},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

	public static void main(String[] args) throws Exception {
		int N = sc.nextInt();
		for (int i = 0; i < N; ++i) {
			char ch = 0;
			int count = 0;
			StringBuilder sb = new StringBuilder();
			for (char c : sc.next().toCharArray()) {
				if (c == '0') {
					if (count > 0) sb.append(table[ch - '1'][(count - 1) % table[ch - '1'].length]);
					count = 0;
				} else {
					ch = c;
					++count;
				}
			}
			System.out.println(sb);
		}
	}

}