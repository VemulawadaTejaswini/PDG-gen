import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[][] s = new String[H][W];
		for (int i=0; i<H; i++) {
				s[i] = sc.next().split("");
		}
		sc.close();

		String ans = "Yes";

		iLoop : for (int i=0; i<H; i++) {
			for (int j=0; j<W; j++) {
				if ("#".equals(s[i][j])) {
					Boolean upper = false;
					Boolean lower = false;
					Boolean left = false;
					Boolean right = false;

					if(i>0) {
						upper = "#".equals(s[i-1][j]);
					}

					if (i<H-1) {
						lower = "#".equals(s[i+1][j]);
					}

					if (j>0) {
						left =  "#".equals(s[i][j-1]);
					}

					if (j<W-1) {
						right = "#".equals(s[i][j+1]);
					}

					if (!(upper || lower || left || right)) {
						ans = "No";
						break iLoop;
					}
				}
			}
		}

		System.out.println(ans);
	}
}

