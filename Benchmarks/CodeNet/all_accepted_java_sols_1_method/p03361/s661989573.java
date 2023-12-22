import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int y = in.nextInt();
        int x = in.nextInt();
        
        String n;
        
        int map[][] = new int[y][x];
        
        int count=0;
        for(int i=0;i<y;i++){
        	n=in.next();
        	for(int j=0;j<x;j++){
        		map[i][j]=(n.charAt(j)=='#'?1:0);
        		count+=map[i][j];
        	}
        	
        }
        
        for(int i=1;i<y;i++)
        	for(int j=0;j<x;j++){
        		if(map[i][j]==1&&map[i-1][j]==1){
        			map[i][j]+=10;
        			map[i-1][j]+=10;
        			count -=2;
        		}else if(map[i][j]==1&&map[i-1][j]==11){
        			map[i][j]+=10;
        			count--;
        		}else if(map[i][j]==11&&map[i-1][j]==1){
        			map[i-1][j]+=10;
        			count--;
        		}
        		if(count==0) break;
        	}
        
        for(int i=0;i<y;i++)
        	for(int j=1;j<x;j++){
        		if(map[i][j]==1&&map[i][j-1]==1){
        			map[i][j]+=10;
        			map[i][j-1]+=10;
        			count -=2;
        		}else if(map[i][j]==1&&map[i][j-1]==11){
        			map[i][j]+=10;
        			count--;
        		}else if(map[i][j]==11&&map[i][j-1]==1){
        			map[i][j-1]+=10;
        			count--;
        		}
        		if(count==0) break;
        	}
        
        if(count==0)
        	System.out.println("Yes");
        else
        	System.out.println("No");
     
    }

}
