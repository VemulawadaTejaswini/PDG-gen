import java.util.BitSet;
import java.util.HashMap;
import java.util.Scanner;

import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main{
	
	// teight_meight ??????????????????????????????
	// ??????????????¨
	
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){

            int n = in.nextInt();
            int m = in.nextInt();
            if (n + m == 0) break;
 
            int[] c = new int[m];
            for (int i=0; i<m; i++) {
                c[i] = in.nextInt();
            }
 
            int[] dp = new int[256];
            fill(dp,Integer.MAX_VALUE);
            dp[128] = 0;
 
            for (int k=0; k<n; k++) {
                int x = in.nextInt();
                int[] temp = new int[256];
                fill(temp,Integer.MAX_VALUE);
                for (int i=0; i<256; i++) {
                    if (dp[i] == Integer.MAX_VALUE) continue;
                    for (int j=0; j<m; j++) {
                        int cur = i + c[j];
                        if (cur < 0) cur = 0;
                        else if (255 < cur) cur = 255;
                        temp[cur] = min(temp[cur],dp[i] + (cur-x)*(cur-x));
                    }
                }
                dp = temp;
            }
 
            int min = Integer.MAX_VALUE;
            for (int i=0; i<256; i++) {
                min = min(min, dp[i]);
            }
 
            System.out.println(min);
		}
	}
	
}