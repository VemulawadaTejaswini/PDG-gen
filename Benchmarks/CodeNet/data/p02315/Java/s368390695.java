import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Collections;
import java.awt.Point;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NW = br.readLine().split(" ");
        int N = Integer.parseInt(NW[0]);
        int W = Integer.parseInt(NW[1]);
        int[][] vw = new int[N+1][2];
        
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            vw[i+1][0] = Integer.parseInt(s[0]);
            vw[i+1][1] = Integer.parseInt(s[1]);
        }
        
        int[][] dp = new int[N+1][W+1];
        
        for (int i = 0; i <= N; i++) {
            dp[i][0] = 0;
        }
        
        for (int i = 0; i <= W; i++) {
            dp[0][i] = 0;
        }
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= W; j++) {
                if (j-vw[i][1] >= 0) {
                    dp[i][j] = Math.max(dp[i-1][j-vw[i][1]]+vw[i][0], dp[i-1][j]);
                }
                else dp[i][j] = dp[i-1][j];
            }
        }
        
        /*for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= W; j++) {
                if (j+1 == W) System.out.println(dp[i][j]);
                else System.out.print(dp[i][j] + " ");
            }
        }*/
        
        
        System.out.println(dp[N][W]);
    }
}

class Box {
    int w;
    int h;
    public Box(int w, int h) {
        this.w = w;
        this.h = h;
    }
}

class BoxComparator1 implements Comparator<Box>{
	public int compare(Box b1, Box b2) {
		return b1.w - b2.w;
	}
}

class BoxComparator2 implements Comparator<Box> {
    public int compare(Box b1, Box b2) {
        return b1.h - b2.h;
    }
}

