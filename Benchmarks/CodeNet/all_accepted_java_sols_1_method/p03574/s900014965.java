import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h];
		char[][] grid = new char[h+2][w+2];
		for(int i=0; i<h; i++){
			s[i] = sc.next();
			for(int j=0; j<w; j++){
				grid[i+1][j+1] = s[i].charAt(j);
			}
		}
		for(int i=1; i<=h; i++){
			for(int j=1; j<=w; j++){
				int count = 0;
				if(grid[i][j]=='#')System.out.print("#");
				else{
					if(grid[i+1][j+1]=='#')count++;
					if(grid[i+1][j]=='#')count++;
					if(grid[i+1][j-1]=='#')count++;
					if(grid[i][j+1]=='#')count++;
					if(grid[i][j-1]=='#')count++;
					if(grid[i-1][j+1]=='#')count++;
					if(grid[i-1][j]=='#')count++;
					if(grid[i-1][j-1]=='#')count++;
					System.out.print(count);
				}
			}
		System.out.println("");
		}
	}
}