import java.util.*;
public class Main{

    void run(){
        Scanner sc = new Scanner(System.in);
        int[][] dp = new int[5][4001];
        dp[0][0] = 1;
        for(int i = 1; i < 5; i++){
            for(int ii = 0; ii <= 1000 * i; ii++){
                for(int iii = Math.max(0,ii-1000); iii <= ii; iii++){
                    dp[i][ii] += dp[i-1][iii];
                }
            }
        }
        while(sc.hasNext()){
            System.out.println(dp[4][sc.nextInt()]);
        }
    }
    public static void main(String[] args){
        new Main().run();
    }
}
        