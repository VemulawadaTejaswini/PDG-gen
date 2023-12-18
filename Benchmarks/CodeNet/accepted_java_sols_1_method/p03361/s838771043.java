import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        boolean[][] canvas = new boolean[H+2][W+2]; //black <> true, white <>false
        for(int h=0;h<=H+1;h++){
        	canvas[h][0] = false;
        	canvas[h][W+1] = false;
        }
        for(int w=0;w<=W+1;w++){
        	canvas[0][w] = false;
        	canvas[H+1][w] = false;
        }
        
        for(int h=1;h<=H;h++){
        	String line = sc.next();
        	for(int w=1;w<=W;w++) canvas[h][w] = (line.charAt(w-1)=='#');
        }
        
        boolean ans = true;
        for(int h=1;h<=H;h++) for(int w=1;w<=W;w++){
        	if(  canvas[h][w]
        	 && !canvas[h+1][w]
        	 && !canvas[h-1][w]
        	 && !canvas[h][w+1]
        	 && !canvas[h][w-1]) ans = false;
        }
        System.out.println(ans ? "Yes" : "No");
    }
}