import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);
		
		for(int i=0;i<=1000000000;i++) {
			int a=Math.abs(h-i);
			int b=Math.abs(w-i);
			
			if(a==b) {
				System.out.println(i);
				return;
			}
		}
		
		System.out.println("IMPOSSIBLE");
		
		/*int k = Integer.parseInt(str[2]);

		String matrix[][] = new String[h][w];

		for (int i = 0; i < h; i++) {
			str = br.readLine().split("");
			for (int j = 0; j < w; j++) {
				matrix[i][j] = str[j];
			}
		}

		int cur = 1;
		int ans[][] = new int[h][w];

		for (int i = 0; i < h; i++) {
			boolean first = true;
			for (int j = 0; j < w; j++) {
				if (matrix[i][j].equals("#")) {
					if (first)
						first = false;
					else
						cur++;
				}
				ans[i][j] = cur;
			}
			cur++;
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}*/
	}
}
