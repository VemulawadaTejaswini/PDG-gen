import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] field = new char[h][];
		for (int i = 0; i < h; i++) {
		    field[i] = sc.next().toCharArray();
		}
		boolean[][] ans = new boolean[h + 2][w + 2];
		for (int i = 2; i <= h; i++) {
		    Arrays.fill(ans[i], true);
		    ans[i][0] = false;
		    ans[i][w + 1] = false;
		}
		for (int i = 1; i <= h; i++) {
		    for (int j = 1; j <= w; j++) {
		        if (field[i - 1][j - 1] == 'o') {
		            ans[i][j - 1] = false;
		            ans[i][j] = false;
		            ans[i][j + 1] = false;
		        } else if (field[i - 1][j - 1] == 'x') {
		            for (int k = i - 1; k <= i + 1; k++) {
		                for (int l = j - 1; l <= j + 1; l++) {
		                    ans[k][l] = false;
		                }
		            }
		        }
		    }
		}
		int count = 0;
		for (int i = 1; i <= h; i++) {
		    for (int j = 1; j <= w; j++) {
		        if (ans[i][j]) {
		            count++;
		        }
		    }
		}
        System.out.println(count);
	}
}

