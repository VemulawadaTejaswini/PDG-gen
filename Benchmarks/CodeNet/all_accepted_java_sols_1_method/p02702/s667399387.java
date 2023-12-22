import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] dp = new int[2019];
        int[] tdp = new int[2019];
        int ans=0,cur;
        for(int i=0; i<s.length(); i++){
            cur = s.charAt(i)-'0';
            tdp[cur]++;
            for(int k=0; k<2019; k++){
                tdp[(10*k+cur)%2019] += dp[k];
            }
            ans+=tdp[0];
            for(int k=0; k<2019; k++){
                dp[k]=tdp[k];
                tdp[k]=0;
            }
        }
        System.out.println(ans);     

    }
}

//10 3 10 3