import java.io.*;
import java.util.*;

class Main{
    static int[][] map;
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    int n = Integer.valueOf(sc.readLine());
	    for(int k=1; k<=n; k++){
		String st = sc.readLine();
		map = new int[14][14];
		for(int i=3; i<11; i++){
		    st = sc.readLine();
		    for(int j=3; j<11; j++)
			map[i][j] = st.charAt(j-3)-'0';
		}
		int x = Integer.valueOf(sc.readLine())+2;
		int y = Integer.valueOf(sc.readLine())+2;
		solve(x,y);
		System.out.println("Data "+k+":");
		for(int t=3; t<11; t++){
		    for(int u=3; u<11; u++)
			System.out.print(map[t][u]);
		    System.out.println();
		}
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
    static void solve(int x, int y){
	if(map[y][x]==1){
	    map[y][x]=0;
	    for(int i=-3; i<0; i++){
		solve(x+i,y);
		solve(x,y+i);
	    }
	    for(int i=1; i<4; i++){
		solve(x+i,y);
		solve(x,y+i);
	    }
	}
    }
}