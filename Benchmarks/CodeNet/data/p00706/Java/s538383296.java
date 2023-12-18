import java.util.Scanner;


public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ1125().main();
	}
	
	class AOJ1125{
		int n,w,h,plusX,plusY;
		boolean[][] map;
		void main(){
			while(true){
				n = in.nextInt();
				if(n==0)break;
				w = in.nextInt();
				h = in.nextInt();
				map = new boolean[h][w];
				for(int i=0;i<n;i++){
					int x = in.nextInt()-1;
					int y = in.nextInt()-1;
					map[y][x] = true;
				}
				plusX = in.nextInt(); plusY = in.nextInt();
//				print();
				doIt();
			}
		}
		
		void doIt(){
			int max = -1;
			for(int y=0;y<h;y++)for(int x=0;x<w;x++){
				int c = count(x, y);
				max = Math.max(max, c);
			}
			System.out.println(max);
		}
		
		int count(int x,int y){
			int result = 0;
			if(x+plusX > w || y+plusY > h)return -1;
			for(int i=x;i<x+plusX;i++)for(int s=y;s<y+plusY;s++)if(map[s][i])result++;
			return result;
		}
		
		void print(){
			System.out.println();
			for(int i=0;i<h;i++){
				for(int s=0;s<w;s++)System.out.print(map[i][s]? '*':'.');
				System.out.println();
			}
		}
		
	}
	
}