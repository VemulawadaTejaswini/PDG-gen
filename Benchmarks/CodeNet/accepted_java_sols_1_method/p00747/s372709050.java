import java.util.*;
import java.math.*;
import java.text.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[][] door = new int[59][30];
		int[][] room = new int[30][30];
		while(true){
			int x = in.nextInt();
			int y = in.nextInt();
			if(x==0 && y==0) break;
			for(int n=0; n<y*2-1; n++){
				if(n%2==1){
					for(int m=0; m<x; m++){
						door[n][m] = in.nextInt();
					}
				}else{
					for(int m=0; m<x-1; m++){
						door[n][m] = in.nextInt();
					}
				}
			}
			for(int m=0; m<y; m++){
				for(int n=0; n<x; n++){
					room[m][n]=9999;
				}
			}
			room[0][0]=1;
			while(true){
				boolean rev = true;
				for(int m=0; m<y; m++){
					for(int n=0; n<x; n++){
						//if (2,3) pull (4,2) from (2,2)
						//if (3,4) pull (6,3) from (3,3)
						if(n>0 && door[m*2][n-1]==0 && room[m][n]>room[m][n-1]+1){
							room[m][n]=room[m][n-1]+1;
							rev = false;
						}
						//if (2,3) pull (4,3) from (2,4)
						//if (3,4) pull (6,4) from (3,5)
						if(n<x-1 && door[m*2][n]==0 && room[m][n]>room[m][n+1]+1){
							room[m][n]=room[m][n+1]+1;
							rev = false;
						}
						//if (2,3) pull (3,3) from (1,3)
						//if (3,4) pull (5,5) from (2,4)
						if(m>0 && door[m*2-1][n]==0 && room[m][n]>room[m-1][n]+1){
							room[m][n]=room[m-1][n]+1;
							rev = false;
						}
						//if (2,3) pull (5,3)
						//if (3,4) pull (7,5)
						if(m<y-1 && door[m*2+1][n]==0 && room[m][n]>room[m+1][n]+1){
							room[m][n]=room[m+1][n]+1;
							rev = false;
						}
					}
				}
				if(rev) break;
			}
			if(room[y-1][x-1]==9999) System.out.println("0");
			else System.out.println(room[y-1][x-1]);
		}
	}
}