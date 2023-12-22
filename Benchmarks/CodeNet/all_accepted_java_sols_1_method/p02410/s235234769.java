import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ss = br.readLine().split(" ");
        int n = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);
        int[][] num1 = new int[n][m];
        int[] num2 = new int[m];
        int a=0;

        for(int i=0; i<n; i++){
            String[] str = br.readLine().split(" ");
            for(int j=0; j<m; j++){
                num1[i][j] = Integer.parseInt(str[j]);;
                
                //System.out.print(num1[i][j]);
            }
                //System.out.println("");
        }
        for(int i=0; i<m; i++){
        	num2[i] = Integer.parseInt(br.readLine());
            //System.out.println(num2[i]);
        }
        for(int i=0; i<n; i++){
        	for(int j=0; j<m; j++){
        		a += num1[i][j] * num2[j];
        	}
        	System.out.println(a);
        	a=0;
        }
    }
}