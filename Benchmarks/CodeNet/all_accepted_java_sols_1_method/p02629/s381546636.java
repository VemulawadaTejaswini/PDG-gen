import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken())-1;
        int len = 1;
        for (int i=1; i<13; i++) {
            long sub = (long)Math.pow(26,i);
            if (N-sub>=0) {
                N-=sub;
                len++;
            }
            else
                break;
        }

        String ans = "";

        for (int i=len-1; i>=0; i--) {
            long sub = (long)Math.pow(26,i);
            ans+=(char)(N/sub+'a');
            N=N%sub;
        }

        System.out.println(ans);
        



        



    }

}