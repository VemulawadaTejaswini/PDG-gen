import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		while(true){
			int X = 10;
			int Y = 10;
			int[][] map = new int[21][21]; 
			int N = sc.nextInt();
			if(N==0) break;
			for(int s=0;s<N;s++){
				map[sc.nextInt()][sc.nextInt()]=1;;
			}
			int M = sc.nextInt();
			for(int s=0;s<M;s++){
				String tmp = sc.next();
				int d = sc.nextInt();
				for(int k=1;k<=d;k++){
					if(tmp.equals("N")){
						Y++;
					}else if(tmp.equals("E")){
						X++;
					}else if(tmp.equals("S")){
						Y--;
					}else if(tmp.equals("W")){
						X--;
					}
					map[X][Y] = 0;
				}
			}
			boolean e = true;
			for(int x=0;x<21;x++){
				for(int y=0;y<21;y++){
					if(map[x][y]!=0){
						e = false;
					}
				}
			}
			if(e){
				pr.println("Yes");
			}else{
				pr.println("No");
			}
		}
		pr.flush();
		sc.close();
	}
	static class Point{
		int x,y;
		public Point(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
}