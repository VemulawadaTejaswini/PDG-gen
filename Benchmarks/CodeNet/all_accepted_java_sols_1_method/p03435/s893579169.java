import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		int[][] c = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				c[i][j] = Integer.parseInt(sc.next());
			}
		}
		sc.close();
		sc = null;
		int a1, a2, a3, b1, b2, b3;
		String ans = "No";
		LABEL:for(a1 = 0; a1 <= 100; a1++) {
			for(a2 = 0; a2 <= 100; a2++) {
				for(a3 = 0; a3 <= 100; a3++) {
					b1 = c[0][0] - a1;
					b2 = c[0][1] - a1;
					b3 = c[0][2] - a1;
					if(a2+b1 == c[1][0] &&
					   a2+b2 == c[1][1] &&
					   a2+b3 == c[1][2] &&
					   a3+b1 == c[2][0] &&
					   a3+b2 == c[2][1] &&
					   a3+b3 == c[2][2]) {
						ans = "Yes";
						break LABEL;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
