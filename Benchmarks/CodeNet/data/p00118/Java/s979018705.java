//Volume1-0118
import java.util.Scanner;

public class Main {

	//declare
	private static int         h,w,num;
	private static char   [][] orchard;
	private static boolean[][] map;

	public static void main(String[] args) {

		String[] s;

        //input
        Scanner sc = new Scanner(System.in);
        while(true){
        	s = sc.nextLine().split("\\s");
        	h = Integer.parseInt(s[0]);
        	w = Integer.parseInt(s[1]);
        	if(h+w==0){break;}
        	orchard = new char   [h][w];
        	map     = new boolean[h][w];
        	for(int i=0;i<h;i++){
       			orchard[i] = sc.nextLine().toCharArray();
        	}

        	//calculate
        	num = 0;
        	for(int i=0;i<h;i++){
        		for(int j=0;j<w;j++){
        			if(!map[i][j]){
        				num++;
        				DFS(i,j,orchard[i][j]);
        			}
        		}
        	}

        	//output
        	System.out.println(num);
        }
	}

	public static void DFS(int y,int x,char c){
		if(c != orchard[y][x] || map[y][x]){return;}
		map[y][x] = true;
		if(x-1 >= 0){DFS(y,x-1,c);}
		if(y-1 >= 0){DFS(y-1,x,c);}
		if(x+1 <  w){DFS(y,x+1,c);}
		if(y+1 <  h){DFS(y+1,x,c);}
	}
}