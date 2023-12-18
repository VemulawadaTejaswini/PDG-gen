import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		boolean[][] map = new boolean[n][m];
		boolean[] nn = new boolean[n], mm = new boolean[m];
		String str;
		for(int i = 0; i < n; i++) {
			str = sc.next();
			for(int j = 0; j < m; j++) {
				map[i][j] = str.charAt(j) == '#' ? true : false;
				nn[i] |= map[i][j];
				mm[j] |= map[i][j];
			}
		}
		for(int i = 0; i < n; i++) {
			if(!nn[i])continue;
			for(int j = 0; j < m; j++) {
				if(!mm[j])continue;
				System.out.print(map[i][j]?'#':'.');
			}
			System.out.println();
		}
	}
}
