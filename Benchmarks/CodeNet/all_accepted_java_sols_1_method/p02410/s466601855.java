import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);
        int i, j;
        int[][] A = new int[n][m];
        int[] b = new int[m];
        int ci;
        String[] row;
        for (i = 0; i < n; i++) {
            row = br.readLine().split(" ");
            for (j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(row[j]);
            }
        }
        for (j = 0; j < m; j++) {
            b[j] = Integer.parseInt(br.readLine());
        }
        for (i = 0; i < n; i++) {
            ci = 0;
            for (j = 0; j < m; j++) {
                ci += A[i][j] * b[j];
            }
            System.out.println(ci);
        }
    }
}