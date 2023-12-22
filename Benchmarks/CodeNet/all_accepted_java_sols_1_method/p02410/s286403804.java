import java.io.*;

public class Main{
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] str = br.readLine().split(" ");
	int n = Integer.parseInt(str[0]);
	int m = Integer.parseInt(str[1]);
	int[][] MatA = new int[n][m];
	int[] MatB = new int[m];
	int ans;

	for(int i = 0; i < n; i++){
		String[] strx = br.readLine().split(" ");
		for(int j = 0; j < m; j++){
			MatA[i][j] = Integer.parseInt(strx[j]);
		}
	}

	for(int k = 0; k < m; k++){
		MatB[k] = Integer.parseInt(br.readLine());
	}

	for(int x = 0; x < n; x ++){
		ans = 0;
		for(int y = 0; y < m; y++){
			ans += MatA[x][y] * MatB[y];
		}
		System.out.println(ans);
	}
}
}