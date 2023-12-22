import java.io.*;

class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int n, m;
        String[] str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        int[][] arr = new int[n][m];
        int[] vec = new int[m];
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            String[] str2 = br.readLine().split(" ");
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(str2[j]);
            }
        }

        for(int i = 0; i < m; i++){
            vec[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ans[i] += arr[i][j]*vec[j];
            }
        }

        for(int num : ans){
            System.out.println(num);
        }
    }
}