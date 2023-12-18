import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int[] num = new int[a];
        int z[] = new int[a];
        String[] str = br.readLine().split(" ");
        for(int i=0; i<a; i++){
            num[i] = Integer.parseInt(str[i]);
            //System.out.println(num[i]);
        }
        for(int t=0; a>0; t++){
             z[t] = num[--a];
             sb.append(z[t]);
             sb.append(" ");
        }
        System.out.println(sb);
    }
}