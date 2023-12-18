import java.util.*;
public class Main{
	static int [][]map = new int[9][9];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 1;
		while(c<=n){
			System.out.println("Data " + c++ + ":");

			
			for(int i=1; i<=8; i++){
				String s = sc.next();
				for(int k=1; k<=s.length(); k++)
					map[i][k] = Integer.parseInt(s.substring(k-1, k));
			}
			int x = sc.nextInt();
			int y = sc.nextInt();
			solve(y, x);
			ans();
		}
	}
	

	static void solve(int y, int x){
		map[y][x] = 0;
		for(int a=x-3; a<=x+3; a++)
			if(a>=1 && a<=8 && map[y][a]==1)
				solve(y, a);
		for(int b=y-3; b<=y+3; b++)
			if(b>=1 && b<=8 && map[b][x]==1)
				solve(b, x);
	}

	static void ans(){
		for(int i=1; i<=8; i++){
			for(int k=1; k<=8; k++)
				System.out.print(map[i][k]);
			System.out.println();
		}
	}
}