import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    while(true){
		String[] st = sc.readLine().split(" ");
		int H = Integer.valueOf(st[0]), W = Integer.valueOf(st[1]);
		if(H==0 && W==0)
		    break;
		int[][] map = new int[H][W];
		for(int i=0; i<H; i++){
		    String sp = sc.readLine();
		    for(int j=0; j<W; j++){
			if(sp.charAt(j)=='>')
			    map[i][j] = 1;
			else if(sp.charAt(j)=='v')
			    map[i][j] = 2;
			else if(sp.charAt(j)=='<')
			    map[i][j] = 3;
			else if(sp.charAt(j)=='^')
			    map[i][j] = 4;
		    }
		}
		int x=0, y=0; boolean flag = false;
		while(true){
		    int a = x, b = y;
		    if(map[x][y]==1)
			y++;
		    else if(map[x][y]==2)
			x++;
		    else if(map[x][y]==3)
			y--;
		    else if(map[x][y]==4)
			x--;
		    else if(map[x][y]==0)
			break;
		    else if(map[x][y]==-1){
			flag = true;
			break;
		    }
		    map[a][b] = -1;
		}
		if(flag)
		    System.out.println("LOOP");
		else
		    System.out.println(y+" "+x);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}