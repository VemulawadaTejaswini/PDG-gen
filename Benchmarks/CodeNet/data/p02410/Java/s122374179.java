import java.io.*;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[][] matrix = new int[n][m];
        int[] vector = new int[m];
        int[] result = new int[n];

        //??????????????¨???????????????
        for(int i=0; i<n; i++){
            String[] str2 = br.readLine().split(" ");
            for(int k=0; k<m; k++){
                matrix[i][k] = Integer.parseInt(str2[k]);
            }
        }
        for(int i=0; i<m; i++){
            vector[i] = Integer.parseInt(br.readLine());
        }

        //???????????? x ??????
        for(int i=0; i<n; i++){
            for(int k=0; k<m; k++){
                result[i] += matrix[i][k] * vector[k];
            }
        }

        //??????
        for(int i=0; i<n; i++){
            System.out.println(result[i]);
        }

    }
}