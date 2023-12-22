import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int r=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        int[][] matrix=new int[r+1][c+1];
        int sum;
        for(int i=0;i<r;i++){
            st=new StringTokenizer(br.readLine());
            sum=0;
            for(int j=0;j<c;j++){
                matrix[i][j]=Integer.parseInt(st.nextToken());
                sum+=matrix[i][j];
            }matrix[i][c]=sum;
        }for(int i=0;i<c+1;i++){
            sum=0;
            for(int j=0;j<r;j++){
                sum+=matrix[j][i];
            }matrix[r][i]=sum;
        }
        for(int i=0;i<r+1;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println(matrix[i][c]);
        }
    }
}