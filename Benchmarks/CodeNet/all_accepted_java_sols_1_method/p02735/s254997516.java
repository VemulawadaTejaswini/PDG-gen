import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] nums = new boolean[h][w];
        String tmp;
        for (int i = 0; i < h; i++) {
            tmp = sc.next();
            for (int j = 0; j < w; j++) {
                if (tmp.charAt(j) == '#') {
                    nums[i][j] = true;
                }
            }
        }
        int[][] dp = new int[h][w];
        int tmpa;
        int tmpb;
        if (nums[0][0]) {
            dp[0][0] = 1;
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }else if(i == 0) {
                    if (!(nums[0][j - 1]) && nums[0][j]) {
                        dp[0][j] = dp[0][j - 1] + 1;
                    } else {
                        dp[0][j] = dp[0][j - 1];
                    }
                }else if(j == 0) {
                    if (!(nums[i - 1][0]) && nums[i][0]) {
                        dp[i][0] = dp[i - 1][0] + 1;
                    } else {
                        dp[i][0] = dp[i - 1][0];
                    }
                } else {
                    if (!(nums[i - 1][j]) && nums[i][j]) {
                        tmpa = dp[i - 1][j] + 1;
                    } else {
                        tmpa=dp[i-1][j];
                    }
                    if((!nums[i][j-1])&&nums[i][j]){
                        tmpb=dp[i][j-1]+1;
                    }else{
                        tmpb=dp[i][j-1];
                    }
                    dp[i][j]=Math.min(tmpa, tmpb);
                }
            }
        }
        System.out.println(dp[h-1][w-1]);

    }

}