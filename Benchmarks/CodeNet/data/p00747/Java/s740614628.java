import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(true){
			int w = in.nextInt();
			int h = in.nextInt();
			if(w+h==0)break;
			new AOJ1166().doIt(w,h);
		}
	}

	class AOJ1166{
		int w,h;
		void doIt(int w,int h){
			this.w = w;this.h = h;
			boolean yoko[][] = new boolean[h][w-1];
			boolean tate[][] = new boolean[h-1][w];
			for(int i=0;i<h*2-1;i++){
				if(i%2==0){
					for(int s=0;s<w-1;s++){
						int a = in.nextInt();
						if(a==1)yoko[i/2][s] = false;
						else yoko[i/2][s] = true;
					}
				}else{
					for(int s=0;s<w;s++){
						int a = in.nextInt();
						if(a==1)tate[i/2][s] = false;
						else tate[i/2][s] = true;
					}
				}
			}
//			for(int i=0;i<h;i++){
//				for(int s=0;s<w-1;s++)System.out.print(yoko[i][s]+" ");
//				System.out.println();
//			}
//			for(int i=0;i<h-1;i++){
//				for(int s=0;s<w;s++)System.out.print(tate[i][s]+" ");
//				System.out.println();
//			}
			int sx[] = {1,0,-1,0};
			int sy[] = {0,1,0,-1};
			LinkedList<State> q = new LinkedList<State>();
			int max = Integer.MAX_VALUE/2;
			int[][] map = new int[h][w];
			for(int i=0;i<h;i++)Arrays.fill(map[i], max);
			q.add(new State(0, 0, 1));
			int result = 0;
			while(q.size()>0){
				State now = q.remove();
				int x = now.x,y = now.y;
				if(map[y][x]<=now.step)continue;
				map[y][x] = now.step;
				if(now.x == w-1&&now.y == h-1){
					result = now.step;
					break;
				}
				for(int i=0;i<4;i++){
					int nx = sx[i]+x, ny = sy[i]+y;
					if(nx<0||nx>=w||ny<0||ny>=h)continue;
					if(i==0){//右
						if(yoko[y][x]==false)continue;
					}else if(i==2){//左
						if(yoko[y][x-1]==false)continue;
					}else if(i==1){//下
						if(tate[y][x]==false)continue;
					}else if(i==3){//上
						if(tate[y-1][x]==false)continue;
					}
					q.add(new State(nx, ny, now.step+1));
				}
			}
			
//			for(int i=0;i<h;i++){
//				for(int s=0;s<w;s++)System.out.print(map[i][s]+" ");
//				System.out.println();
//			}
			
			System.out.println(result);
		}
		class State{
			int x,y,step;
			public State(int x,int y,int step) {
				this.x = x;
				this.y = y;
				this.step = step;
			}
		}
	}
}