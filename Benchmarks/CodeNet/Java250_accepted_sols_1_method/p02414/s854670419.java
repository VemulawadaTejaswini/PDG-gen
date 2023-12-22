import java.io.*;

class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int l = Integer.parseInt(str[2]);
        int[][] aMatrix = new int[n][m];
        int[][] bMatrix = new int[m][l];
        long sum = 0;

        //?????????A???????????????????´???????
        for(int i=0; i<n; i++){
            str = br.readLine().split(" ");
            for(int k=0; k<m; k++){
                aMatrix[i][k] = Integer.parseInt(str[k]);
            }
        }

        //  ??????B???????????????????´???????
        for(int i=0; i<m; i++){
            str = br.readLine().split(" ");
            for(int k=0; k<l; k++){
                bMatrix[i][k] = Integer.parseInt(str[k]);
            }
        }

        //?????????????????????C????±???????
        for(int i=0; i<n; i++){
            for(int k=0; k<l; k++){
                for(int w=0; w<m; w++){
                    sum += (long) aMatrix[i][w] * bMatrix[w][k];
                }
                if(k!=0)sb.append(" ");
                sb.append(sum);
                sum = 0;
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}