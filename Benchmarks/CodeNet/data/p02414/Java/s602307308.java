import java.util.*;
import java.io.*;
 
class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ss = br.readLine().split(" ");
         
        int n = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);
        int l = Integer.parseInt(ss[2]);
        int num1[][] = new int[n][m];
        int num2[][] = new int[m][l];
         
        for(int i=0; i<n; i++){
            String[] s = br.readLine().split(" ");
            for(int j=0; j<m; j++){
                num1[i][j] = Integer.parseInt(s[j]);
            }
        }
        for(int i=0; i<m; i++){
            String[] str = br.readLine().split(" ");
            for(int j=0; j<l; j++){
                num2[i][j] = Integer.parseInt(str[j]);
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<l; j++){
                long a=0;
                for(int k=0; k<m; k++){
                    a += num1[i][k] * num2[k][j];
                }
                System.out.print(a);
                if(j+1<l){
                    System.out.print(" ");
                }
                a=0;
            }
            System.out.println("");
        }
    }
}