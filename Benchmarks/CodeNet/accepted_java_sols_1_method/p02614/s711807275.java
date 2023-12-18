import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		char[][] field = new char[h][];
		for (int i = 0; i < h; i++) {
		    field[i] = sc.next().toCharArray();
		}
		int ans = 0;
		for (int a = 0; a < (1 << h); a++) {
		    for (int b = 0; b < (1 << w); b++) {
		        int count = 0;
		        for (int i = 0; i < h; i++) {
		            if ((a & (1 << i)) == 0) {
		                continue;
		            }
		            for (int j = 0; j < w; j++) {
		                if ((b & (1 << j)) != 0 && field[i][j] == '#') {
		                    count++;
		                } 
		            }
		        }
		        if (count == k) {
		            ans++;
		        }
		    }
		}
		System.out.println(ans);
	}
}
