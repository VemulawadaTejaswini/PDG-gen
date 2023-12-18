import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] c = new int[10][10];
        for(int i=0;i<10;i++){
        	for(int j=0;j<10;j++){
        	    c[i][j]=sc.nextInt();
        	}
        }
        int[][] A = new int[H][W];
        int[] wall = new int[10];
        for(int h=0;h<H;h++){
        	for(int w=0;w<W;w++){
        	    A[h][w]=sc.nextInt();
        	    if(A[h][w]>=0) wall[A[h][w]]++;
        	}
        }
        
        int distance[] = new int[10];//to 1
        for(int i=0;i<10;i++){
        	distance[i] = c[i][1];
        }
        for(int t=0;t<10;t++){
        	for(int i=0;i<10;i++)for(int j=0;j<10;j++){
        	    if(distance[i]>c[i][j]+distance[j]){
        	        distance[i]=c[i][j]+distance[j];
        	    }
        	}
        }
        
        long ans = 0;
        for(int i=0;i<10;i++) ans += distance[i]*wall[i];
        System.out.println(ans);
        
    }
}