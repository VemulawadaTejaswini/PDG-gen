import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int w, h;
	static int[][] field;
	static Queue<int[][]> q;
	static Queue<Integer> x;
	static Queue<Integer> y;
	static Queue<Integer> floor;
	static int[] v1 = {1, 0, -1, 0};
	static int[] v2 = {0, 1, 0, -1};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		label:while(true){
			w = cin.nextInt();
			h = cin.nextInt();
			q = new LinkedList<int[][]>();
			x = new LinkedList<Integer>();
			y = new LinkedList<Integer>();
			floor = new LinkedList<Integer>();
			if(w+h==0){
				break;
			}
			
			field = new int[h+2][w+2];
			for(int i= 0; i < h+2;i++){
				field[i][0] = -1;
				field[i][w+1] = -1;
			}
			for(int i= 0; i < w+2;i++){
				field[0][i] = -1;
				field[h+1][i] = -1;
			}
			for(int i= 1; i <= h;i++){
				for(int j = 1; j <= w; j++){
					String str = cin.next();
					field[i][j] = Integer.parseInt(str);
					if(field[i][j] == 2){
						x.add(i);
						y.add(j);
					}
					else if(field[i][j] == 3){
						
					}
				}
			}
			/*
			for(int i= 0; i <= h+1;i++){
				for(int j = 0; j <= w+1; j++){
					System.out.print(field[i][j] + " " );
				}
				System.out.println();
			}
			*/
			q.add(field);
			floor.add(0);
			while(!q.isEmpty()){
				field = q.poll();
				int X = x.poll();
				int Y = y.poll();
				int FLOOR = floor.poll();
				if(FLOOR+1 >= 11){
					break;
				}
				for(int i = 0; i < 4; i++){
					
					int nowX = X;
					int nowY = Y;
					boolean first = true;
					while(true){
						nowX += v1[i];
						nowY += v2[i];
						if(field[nowX][nowY] == 3){
							if(FLOOR+1 >= 11){
								System.out.println(-1);
							}
							else{
								System.out.println(FLOOR+1);
							}
							continue label;
						}
						else if(field[nowX][nowY] == -1){
							break;
						}						
						if(first){
							if(field[nowX][nowY] == 1){
								break;
							}
							first = false;
						}
						else{
							if(field[nowX][nowY] == 1){
								int[][] a = field.clone();
								a[nowX][nowY] = 0;
								a[nowX-v1[i]][nowY-v2[i]] = 2;
								q.add(a);
								x.add(nowX-v1[i]);
								y.add(nowY-v2[i]);
								floor.add(FLOOR+1);
								break;
							}
						}
					}
					
				}
			}
			System.out.println(-1);
		}

	}
}