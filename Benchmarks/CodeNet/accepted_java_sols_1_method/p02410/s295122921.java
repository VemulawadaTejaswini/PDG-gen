import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        int i,j,sum;
        int[] A = new int[100];
        int[][] B = new int[100][100];
        int[] n = new int[990];
        String[] str = new String[990];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        str = in.readLine().split(" ");
        for(i=0;i<2;i++){
            n[i]=Integer.parseInt(str[i]);
        }
        for(i=0;i<n[0];i++){
            str = in.readLine().split(" ");
            for(j=0;j<n[1];j++){
                B[i][j]=Integer.parseInt(str[j]);
            }
        }
        for(i=0;i<n[1];i++){
            A[i] = Integer.parseInt(in.readLine());
        }
        for(i=0;i<n[0];i++){
            sum=0;
            for(j=0;j<n[1];j++){
                sum+=B[i][j]*A[j];
            }
            System.out.println(sum);
        }
        System.out.flush();
    }
}