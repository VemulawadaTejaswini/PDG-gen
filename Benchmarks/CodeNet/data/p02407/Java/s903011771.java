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
        /*for(int i=0; i<a; i++){
            num[i] = Integer.parseInt(str[i]);
        }*/
        for(int t=0; a>0; t++){
             num[t] = Integer.parseInt(str[--a]);
             sb.append(num[t]);
             sb.append(" ");
        }
        System.out.print(sb);
    }
}