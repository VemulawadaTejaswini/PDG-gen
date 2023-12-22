
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO 自動生成されたメソッド・スタブ
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = 0 , m = 0,l = 0;
        //input
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        l = Integer.parseInt(input[2]);
        //InputMatrix
        long[][] matrixA = new long[n][m];
        long[][] matrixB = new long[m][l];
        long[][] ansMatrix = new long[n][l];

        for(int i = 0;i < n;i++){
            String[] line1 = br.readLine().split(" ");
            for(int j = 0;j < m;j++){
                matrixA[i][j] = Integer.parseInt(line1[j]);
            }
        }
        for(int i = 0;i < m;i++){
            String[] line2 = br.readLine().split(" ");
            for(int j = 0;j < l;j++){
                matrixB[i][j] = Integer.parseInt(line2[j]);
            }
        }
        //Calculate
        for(int i = 0;i < n;i++){
            for(int j = 0;j < l;j++){
                for(int k = 0;k < m;k++){
                    ansMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        //Output
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < n;i++){
            for(int j = 0;j < l;j++){
                sb.append(ansMatrix[i][j]);
                if(j!=l-1)sb.append(" ");
            }
            if(i!=n-1)sb.append("\n");
        }
        System.out.println(sb);

    }

}

