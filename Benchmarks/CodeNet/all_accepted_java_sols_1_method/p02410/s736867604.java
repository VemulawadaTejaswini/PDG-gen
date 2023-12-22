import java.util.*;
 
class Main{
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

        int[][] matrix = new int[n][m];
        int[] vectorB = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j += 1) {
                matrix[i][j] = scan.nextInt();
            }
        }
        for (int s = 0; s < m; s++) {
            vectorB[s] = scan.nextInt();
        }
        for (int t = 0; t < n; t++) {
            int ans = 0;
            for (int u = 0; u < m; u++) {
                ans += matrix[t][u] * vectorB[u];
            }
            System.out.println(ans);
        }
    }
}