import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        int i,tmp;
        int[] A = new int[100];
        String str;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(;(str=in.readLine())!=null;){
            char[] c = str.toCharArray();
            for(i=0;i<c.length;i++){
                tmp = (int)c[i];
                if(64 < tmp && tmp <91) tmp+=32;
                tmp-=97;
                if(tmp < 0 || 27 < tmp) continue;
                A[tmp]+=1;
            }
        }
        for(i=0;i<26;i++){
            System.out.println((char)(97+i)+" : "+A[i]);
        } 
        System.out.flush();
    }
}