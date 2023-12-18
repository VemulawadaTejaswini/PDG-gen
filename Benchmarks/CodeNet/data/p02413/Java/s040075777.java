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
        int sum1=0,sum2=0,sum3=0,sum4=0,sum5=0;
        int sum=0;
        int ans=0;
        while((str=br.readLine())!=null){
            String[] sg = str.split(" ");
            int a = Integer.parseInt(sg[0]);
            int b = Integer.parseInt(sg[1]);
            int f = Integer.parseInt(sg[2]);
            int d = Integer.parseInt(sg[3]);
            int e = Integer.parseInt(sg[4]);
            sum1 += a;
            sum2 += b;
            sum3 += f;
            sum4 += d;
            sum5 += e;
            sum = a + b + f + d + e;
            ans += sum;
            System.out.print(a+" "+b+" "+f+" "+d+" "+e);
            System.out.println(" "+sum);
        }
        System.out.print(sum1+" "+sum2+" "+sum3+" "+sum4+" "+sum5 +" "+ans);
    }
}