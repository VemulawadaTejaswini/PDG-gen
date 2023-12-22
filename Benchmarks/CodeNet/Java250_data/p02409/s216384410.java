import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        int i,j,k,m;
        int [][][] cnt = new int[4][3][10];
        int[] n = new int[990];
        String[] str = new String[990];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(in.readLine());
        for(i=0;i<m;i++){
            str = in.readLine().split(" ");
            for(j=0;j<4;j++){
                n[j] = Integer.parseInt(str[j]);
            }
            cnt[n[0]-1][n[1]-1][n[2]-1] += n[3];
        }
        for(i=0;i<4;i++){
            for(j=0;j<3;j++){
                for(k=0;k<10;k++){
                    System.out.print(" "+cnt[i][j][k]);
                }
                System.out.println();
            }
            if(i<3) System.out.println("####################");
        }
        System.out.flush();
    }
}