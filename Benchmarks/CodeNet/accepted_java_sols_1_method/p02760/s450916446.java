import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringTokenizer st;
		
		
		int[][] array = new int[3][3];
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				array[i][j] = sc.nextInt();
		int[] row = new int[3], col = new int[3], d1 = new int[5], d2 = new int[5];
		int n = sc.nextInt();
		for(int u = 0; u < n; u++) {
			int x = sc.nextInt();
			for(int i = 0; i < 3; i++)
				for(int j = 0; j < 3; j++)
					if(array[i][j] == x) {
						row[i]++;
						col[j]++;
						d1[i + j]++;
						d2[i - j + 2]++;
					}
		}
		
		boolean flag = false;
		for(int i = 0; i < 3; i++) {
			if(row[i] == 3 || col[i] == 3)
				flag = true;
		}
		
		for(int i = 0; i < 5; i++) {
			if(d1[i] == 3 || d2[i] == 3)
				flag = true;
		}
		
		System.out.println(flag ? "Yes" : "No");
		
	}
}