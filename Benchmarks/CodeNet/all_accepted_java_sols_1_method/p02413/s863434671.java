import java.io.*;
import java.util.*;
 
class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int r = Integer.parseInt(s[0]);
        int c = Integer.parseInt(s[1]);
        int[][] num = new int[r][c];
        String str;
        int i=0;
        int j=0;
        int sum1=0,sum2=0,sum3=0;
        while((str=br.readLine())!=null){
            String[] sg = str.split(" ");
            for(; i<sg.length; i++){
                int a = Integer.parseInt(sg[i]);
                num[j][i] = a;
            }
            i=0;
            j++;
        }
        for(int k=0; k<r; k++){
            for(int l=0; l<c; l++){
                sum1 += num[k][l];
                System.out.print(num[k][l]+" ");
            }
            System.out.println(sum1);
            sum1=0;
        }
        for(int k=0; k<c; k++){
            for(int l=0; l<r; l++){
                sum2 += num[l][k];
            }
            System.out.print(sum2+ " ");
            sum3 += sum2;
            sum2=0;
        }
        System.out.println(sum3);
    }
}