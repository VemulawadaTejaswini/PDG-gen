import java.util.*;

import java.util.Map.Entry;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	class E {

		int x;

		int y;

		int c;

		E(int x, int y,int c) {

			this.x = x;

			this.y = y;

			this.c = c;

		}

	}



	void run() {

		for (;;) {

			int w = sc.nextInt();

			int h = sc.nextInt();

			if ((w | h) == 0)

				break;

			boolean[][] down = new boolean[h - 1][w];

			boolean[][] right = new boolean[h][w - 1];

			for (int j = 0; j < w - 1; j++) {

				right[0][j] = sc.nextInt() == 0;

			}

			for (int i = 0; i < h - 1; i++) {

				for (int j = 0; j < w; j++) {

					down[i][j] = sc.nextInt() == 0;

				}

				for (int j = 0; j < w - 1; j++) {

					right[i + 1][j] = sc.nextInt() == 0;

				}

			}

			int [][] cost = new int[h][w];

			boolean[][] visited = new boolean[h][w]; 

			LinkedList<E> l = new LinkedList<Main.E>();

			l.add(new E(0,0,1));

			visited[0][0] = true;

			cost[0][0] = 1;

			for(;!l.isEmpty();){

//				System.out.println(l.size());

				E e = l.pollLast();

				if(e.x+1 < w && right[e.y][e.x]){

					if(!visited[e.y][e.x+1]){

						visited[e.y][e.x+1] = true;

						cost[e.y][e.x+1]=e.c+1;

						l.addFirst(new E(e.x+1,e.y,e.c+1));

					}

				}

				if(e.x-1 >= 0 && right[e.y][e.x-1]){

					if(!visited[e.y][e.x-1]){

						visited[e.y][e.x-1] = true;

						cost[e.y][e.x-1]=e.c+1;

						l.addFirst(new E(e.x-1,e.y,e.c+1));

					}

				}

				if(e.y+1 < h && down[e.y][e.x]){

					if(!visited[e.y+1][e.x]){

						visited[e.y+1][e.x] = true;

						cost[e.y+1][e.x]=e.c+1;

						l.addFirst(new E(e.x,e.y+1,e.c+1));

					}

				}

				if(e.y-1 >= 0 && down[e.y-1][e.x]){

					if(!visited[e.y-1][e.x]){

						visited[e.y-1][e.x] = true;

						cost[e.y-1][e.x]=e.c+1;

						l.addFirst(new E(e.x,e.y-1,e.c+1));

					}

				}

			}

			System.out.println(cost[h-1][w-1]);

		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}