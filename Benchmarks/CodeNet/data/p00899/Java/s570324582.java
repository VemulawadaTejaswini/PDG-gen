import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
    static int[][] t;
    static int n;
    static int[][] dp;

    public static int dist(String a,String b){
        int res = 0;

        for(int i=0;i<=min(a.length(),b.length());i++){
            String asub = a.substring(a.length()-i);
            String bsub = b.substring(0,i);

            if(asub.equals(bsub)){
                res = max(res,i);
            }
        }
        return res;
    }

    static int solve(int id,int bit){
        if(bit == (1<<n)-1){
            return 0;
        }
        if(dp[id][bit] != -1) return dp[id][bit];

        int res = 0;
        for(int i=0;i<n;i++){
            if(t[id][i] != -1 && (bit & (1<<i)) == 0){
                res = max(res,solve(i,bit|(1<<i))+t[id][i]);
            }
        }
        return dp[id][bit] = res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            n = sc.nextInt();
            if(n ==0) break;

            ArrayList<String> al = new ArrayList<String>();
            for(int i=0;i<n;i++){
                al.add(sc.next());
            }

            for(int i=0;i<al.size();i++){
                String s = al.get(i);

                for(int j=0;j<al.size();j++){
                    if(i == j) continue;

                    if(al.get(j).contains(s)){
                        al.remove(i);
                        i--;
                        break;
                    }
                }
            }

            n = al.size();
            t = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    t[i][j] = -1;
                }
            }
            
            for(int i=0;i<al.size();i++){
                for(int j=0;j<al.size();j++){
                    if(i == j) continue;
                    t[i][j] = dist(al.get(i),al.get(j));
                }
            }

            dp = new int[n][(1<<n)];

            int ans = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++) Arrays.fill(dp[j],-1);
                ans = max(ans,solve(i,1<<i));
            }

            int sum = 0;
            for(String s : al){
                sum += s.length();
            }

            System.out.println(sum-ans);
        }
    }
}