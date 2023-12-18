import java.awt.Point;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import javax.naming.InitialContext;
 
public class Main {
     
	static int W, H;
	static char[][] matrix;
	static String[][] dp;
	
	// a < bならTrue
	static Boolean cmp(String a, String b)
	{
		if(a.length() < b.length()) 
			return true;
		else if(a.length() > b.length())
			return false;
		
		for(int i = 0;i < a.length();i++)
		{
			if(a.charAt(i) - b.charAt(i) < 0)
				return true;
			else if(a.charAt(i) - b.charAt(i) > 0)
				return false;
		}
		
		return true;
	}
	
	// a < bならTrue
	// 最初にゼロ刈りする
		static Boolean cmp2(String a, String b)
		{
			int a0num = 0, b0num = 0;
			for(int i = 0;i < a.length();i++)
			{
				if(a.charAt(i) - '0' == 0)
					a0num++;
				else {
					break;
				}
			}
			for(int i = 0;i < b.length();i++)
			{
				if(b.charAt(i) - '0' == 0)
					b0num++;
				else {
					break;
				}
			}
			
			return cmp(a.substring(a0num), b.substring(b0num));
		}
	
	static String calc(int x, int y)
	{
		String a, b;
		if('A' <= matrix[y][x] && matrix[y][x] <= 'Z') return "";
		
		a = matrix[y][x] + dp[y][x + 1];
		b = matrix[y][x] + dp[y + 1][x];

		if(cmp(a, b))
			return b;
		else {
			return a;
		}
	}
    
    static void start()
    {
    	dp = new String[H+1][W+1];
    	
    	dp[H][W] = "";
    	for (int x = W-1; x >= 0; x--) dp[H][x] = "";
    	for (int y = H-1; y >= 0; y--) dp[y][W] = "";
    	
    	int sx = W - 1;
    	int sy = H - 1;
    	
    	while(true)
    	{
    		dp[sy][sx] = calc(sx, sy);
    		
    		for (int x = sx - 1; x >= 0; x--) dp[sy][x] = calc(x, sy);
        	for (int y = sy - 1; y >= 0; y--) dp[y][sx] = calc(sx, y);
        	
        	if(sx == 0 || sy == 0) break;
        	
        	sx--;
        	sy--;
    	}
    	
    	String max = "";
    	for (int y = 0; y < H; y++) {
    		for (int x = 0; x < W; x++) {
    			if(cmp2(max, dp[y][x])) max = dp[y][x];
    			
    			//System.out.println(dp[y][x]);
			}
		}
    	
    	//System.out.println("----------------------------------------");
    	System.out.println(max);
    	//System.out.println("----------------------------------------");
    }
     
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        while(true)
        {
        	W = sca.nextInt();
        	H = sca.nextInt();
        	if(W == 0) break;
        	
        	matrix = new char[H][W];
        	for (int y = 0; y < H; y++) {
        		String str = sca.next();
        		
				for (int x = 0; x < W; x++) {
					matrix[y][x] = str.charAt(x);
				}
			}
            
            start();
        }
        
    }
}