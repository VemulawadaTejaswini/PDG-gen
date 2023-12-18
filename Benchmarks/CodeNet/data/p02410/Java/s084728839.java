import java.io.*;

public class Main{
public static void main(String args[]) throws IOException{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 String[] str = br.readLine().split(" ");
 int n = Integer.parseInt(str[0]);
 int m = Integer.parseInt(str[1]);
 int[][] matrixA = new int[n][m];
 int[] matrixB = new int[m];
 int ans = 0;

//make matrixA
 for(int i = 0; i < n; n++){
	String[] strx = br.readLine().split(" ");
	 for(int k = 0; k < m; m++){
		matrixA[i][k] = Integer.parseInt(strx[k]);
 	}
 }

//make matrixB
 for(int l = 0; l < m; l++){
  String stry = br.readLine();
  matrixB[l] = Integer.parseInt(stry);
 }

//matrix vector multiplication
 for(int x = 0; x < n; n++){
	for(int y = 0; y < m; m++){
		ans += matrixA[x][y] * matrixB[y];
	}
  System.out.println(ans);
 ans = 0;
 }
}
}