import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    String st;
	    int[][] p = new int[14][14];
	    int x, y, size;
	    while((st=sc.readLine())!=null){
		String[] cc = st.split(",");
		x = Integer.valueOf(cc[0])+2;
		y = Integer.valueOf(cc[1])+2;
		size = Integer.valueOf(cc[2]);
		if(size==1){
		    p[y][x]++;
		    p[y][x+1]++;
		    p[y][x-1]++;
		    p[y+1][x]++;
		    p[y-1][x]++;
		}
		else if(size==2){
		    p[y][x]++;
		    p[y][x+1]++;
		    p[y][x-1]++;
		    p[y+1][x]++;
		    p[y-1][x]++;
		    p[y-1][x-1]++;
		    p[y+1][x+1]++;
		    p[y-1][x+1]++;
		    p[y+1][x-1]++;
		}
		else if(size==3){
		    p[y][x]++;
		    p[y][x+1]++;
		    p[y][x-1]++;
		    p[y+1][x]++;
		    p[y-1][x]++;
		    p[y-1][x-1]++;
		    p[y+1][x+1]++;
		    p[y-1][x+1]++;
		    p[y+1][x-1]++;
		    p[y][x-2]++;
		    p[y][x+2]++;
		    p[y-2][x]++;
		    p[y+2][x]++;
		}
	    }
	    int max = 0, count = 0;
	    for(int i=2; i<12; i++)
		for(int j=2; j<12; j++){
		    max = Math.max(max, p[j][i]);
		    if(p[j][i]==0)
			count++;
		}
	    System.out.printf("%d\n%d\n",count,max);
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}