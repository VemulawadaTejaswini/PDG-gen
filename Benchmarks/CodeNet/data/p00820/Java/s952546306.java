import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;
import java.lang.Object;
 
public class Main {
    Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        new Main(); 
    }
   
    public Main() {
        new E().doIt();
    }
    class E{
    	void doIt(){
    		int max = (1 << 15) + 1;
    		int[][] dp = new int[5][max];
            dp[0][0] = 1;
            for(int j=1; j*j<max; j++){
                for(int i=1; i<5; i++){
                    for(int k=j*j; k<max; k++){
                        dp[i][k] += dp[i-1][k-j*j];
                    }
                }
            }
    		while(true){
    			int n = sc.nextInt();
    			if(n == 0)break;
    			int sum = dp[0][n] + dp[1][n] +dp[2][n] + dp[3][n] + dp[4][n];
    			System.out.println(sum);
    		}
    	}
    }
}