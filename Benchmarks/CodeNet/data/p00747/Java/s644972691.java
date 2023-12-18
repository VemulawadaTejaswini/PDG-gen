import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	
	static int[][] smap;
	static int[][] nummap;
	static int w;
	static int h;
	static Queue<Point> queue = new LinkedList<Point>();
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			w = sc.nextInt();
			h = sc.nextInt();
			
			if(w == 0 && h == 0){
				break;
			}
			
			int[][] map = new int[(w * 2) - 1][(h * 2) - 1];
			
			for(int i = 0; i < (h * 2) - 1; i++){
				for(int j = 1; j < (w * 2) - 1; j++){
					map[j][i] = sc.nextInt();
					j++;
				}
				if(i < (h * 2) - 2){
					i++;
					for(int j = 0; j < (w * 2) - 1; j++){
						map[j][i] = sc.nextInt();
						j++;
					}
				}
			}
			
			for(int i = 0; i < (h * 2) - 1; i++){
				for(int j = 0; j < (w * 2) - 1; j++){
					map[j][i] = 0;
					j++;
				}
				if(i < (h * 2) - 2){
					i++;
					for(int j = 1; j < (w * 2) - 1; j++){
						map[j][i] = 0;
						j++;
					}
				}
			}
			
			smap = map;
			nummap = new int[(w * 2) - 1][(h * 2) - 1];
			
			for(int i = 0; i < (h * 2) - 1; i++){
				for(int j = 0; j < (w * 2) - 1; j++){
					nummap[j][i] = Integer.MAX_VALUE;
				}
			}

			queue.clear();
			
			amazing(0,0,0);
			int num = 1;
			int size = 0;
			
			while(true){
				size = queue.size();
				
				for(int i = 0; i < size; i++){
					amazing(queue.peek().x,queue.poll().y , num);
				}
				if(queue.isEmpty() || nummap[(w * 2) - 2][(h * 2) - 2] != Integer.MAX_VALUE){
					break;
				}
				num++;
			}
			if(nummap[(w * 2) - 2][(h * 2) - 2] == Integer.MAX_VALUE){
				System.out.println(0);
			}else{
				System.out.println(nummap[(w * 2) - 2][(h * 2) - 2] + 1);
			}
		}
		
	}

	private static void amazing(int x, int y, int num) {
		nummap[x][y] = num;
		
		if((x + 2) <= (w * 2 - 2) && smap[x + 1][y] == 0 && nummap[x + 2][y] > num + 1){
			queue.offer(new Point(x + 2, y));
			nummap[x + 2][y] = num + 1;
		}
		if((x - 2) >= 0 && smap[x - 1][y] == 0 && nummap[x - 2][y] > num + 1){
			queue.offer(new Point(x - 2, y));
			nummap[x - 2][y] = num + 1;
		}
		if((y + 2) <= (h * 2) - 2 && smap[x][y + 1] == 0 && nummap[x][y + 2] > num + 1){
			queue.offer(new Point(x, y + 2));
			nummap[x][y + 2] = num + 1;
		}
		if((y - 2) >= 0 && smap[x][y - 1] == 0 && nummap[x][y - 2] > num + 1){
			queue.offer(new Point(x, y - 2));
			nummap[x][y - 2] = num + 1;
		}
		
	}

}