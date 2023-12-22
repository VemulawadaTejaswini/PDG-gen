import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		char s[] = br.readLine().toCharArray();
		char t[] = br.readLine().toCharArray();
		br.close();

		int row = t.length;
		int col = s.length;
		int tb[][] = new int[row + 1][col + 1];

		for ( int r = 0; r < row; r++ ) {
			for ( int c = 0; c < col; c++ ) {
				if ( t[r] == s[c] ) {
					tb[r + 1][c + 1] = tb[r][c] + 1;
				} else {
					tb[r + 1][c + 1] = Math.max(tb[r + 1][c], tb[r][c + 1]);
				}
			}
		}

		int r = row;
		int c = col;
		ArrayDeque<Character> stack = new ArrayDeque<Character>();
		stack.add(' ');
		while ( tb[r][c] != 0 ) {

			// 左上に行けるとき
			if ( tb[r - 1][c - 1] == tb[r][c] ) {
				r -= 1;
				c -= 1;
			} else
			// 上
			if ( tb[r - 1][c] == tb[r][c] ) {
				r -= 1;
			} else
			// 左
			if ( tb[r][c - 1] == tb[r][c] ) {
				c -= 1;
			} else
			// 行き止まり
			{
				stack.addFirst( s[c - 1]);
				r -= 1;
				c -= 1;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while ( stack.size() > 0 ) {
			sb.append(stack.pollFirst());
		}
		System.out.println(sb);
	}
}
