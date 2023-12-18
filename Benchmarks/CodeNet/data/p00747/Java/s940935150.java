import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> array_x = new ArrayDeque<Integer>(0);
		Deque<Integer> array_y = new ArrayDeque<Integer>(0);
		int w, h;
		Integer x, y;
		int cnt;
		int dx, dy;

		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0&&h==0) break;
			array_x.clear();
			array_x.add(0);
			array_y.clear();
			array_y.add(0);
			cnt = 0;
			dx = 0;
			dy = 0;
			int[][] wall_vertical = new int[h][w-1];
			int[][] wall_horizontal = new int[h-1][w];
			int[][] flag = new int[h][w];
  
			for(int i=0; i<2*h-1; i++){
				if(i%2==0){
					for(int j=0; j<w-1; j++) wall_vertical[i/2][j] = sc.nextInt();
				}else{
					for(int j=0; j<w; j++) wall_horizontal[i/2][j] = sc.nextInt();
				}
			}

			flag[0][0] = 1;
			while(true){
				x = array_x.poll();
				if(x==null) break;
				y = array_y.poll();

				if(y<h-1&&wall_horizontal[y][x]==0){
					if(y+1==h-1&&x==w-1){
						flag[y+1][x] = 1;
						break;
					}else if(flag[y+1][x]==0){
						flag[y+1][x] = 1;
						array_x.addLast(x);
						array_y.addLast(y+1);
					}
				}
				if(x<w-1&&wall_vertical[y][x]==0){
					if(y==h-1&&x+1==w-1){
						flag[y][x+1] = 2;
						break;
					}else if(flag[y][x+1]==0){
						flag[y][x+1] = 2;
						array_x.addLast(x+1);
						array_y.addLast(y);
					}
				}
				if(y>0&&wall_horizontal[y-1][x]==0){
					if(flag[y-1][x]==0){
						array_x.addLast(x);
						array_y.addLast(y-1);
						flag[y-1][x] = 3;
					}
				}
				if(x>0&&wall_vertical[y][x-1]==0){
					if(flag[y][x-1]==0){
						array_x.addLast(x-1);
						array_y.addLast(y);
						flag[y][x-1] = 4;
					}
				}
			}
			if(flag[h-1][w-2]>0||flag[h-2][w-1]>0){
				while(h-1-dy!=0||w-1-dx!=0){
					switch(flag[h-1-dy][w-1-dx]){
						case 1:
							dy++;
							break;
						case 2:
							dx++;
							break;
						case 3:
							dy--;
							break;
						case 4:
							dx--;
							break;
					}
					cnt++;
				}
				System.out.println(++cnt);
			}else{
				System.out.println("0");
			}
		}
	}
}