import java.util.*;
import java.io.*;

public class Main {
    public static String S;
    public static int ans(int start,long left){
        if(S.charAt(start)-'0'!=1){
            return S.charAt(start)-'0';
        }
        if (left == 0) {
            return S.charAt(start) - '0';
        }
        return ans(start+1,left-1);
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();
        long K = Long.parseLong(br.readLine());
        System.out.println(ans(0,K-1));
    }
}
