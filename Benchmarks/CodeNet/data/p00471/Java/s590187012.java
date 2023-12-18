

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	class b {

		int i;

		int j;



		b(int a, int c) {

			i = a;

			j = c;

		}



		boolean reachable(b o) {

			return this.i == o.i || this.j == o.j;

		}

	}



	boolean and(int a,boolean[] b){

		for(int i=0; i < b.length ; i++){

			if((1&(a>>i))==1 && b[i]) return true;

		}

		return false;

	}

	

	int rec(boolean[] used,int now, int count, boolean[][] reachableS,int[][] reachableP ){

		if(count == used.length){

			if(now != 0)

				return 0;

			return 1;

		}

		int sum = 0;

		for(int i=0;i<used.length;i++){

			if(!used[i]){

				if (!reachableS[now][i])

					continue;

				if (and(reachableP[now][i] , used))

					continue;

				used[i] = true;

//				System.out.printf("%x ",1<<(count*4));

//				System.out.println("push"+i);

				sum += rec(used,i,count+1,reachableS,reachableP);

//				System.out.printf("%x ",1<<(count*4));

//				System.out.println("pop"+i);

				used[i] = false;

			}

		}

		return sum;

	}

	

	void run() {

		for (;;) {

			int w = sc.nextInt();

			int h = sc.nextInt();

			if ((h | w) == 0) {

				break;

			}

			LinkedList<b> list = new LinkedList<Main.b>();

			b start = null;

			int[][] map = new int[h][w];

			int id = 1;

			for (int i = 0; i < h; i++) {

				for (int j = 0; j < w; j++) {

					map[i][j] = -1;

					int z = sc.nextInt();

					if (z == 1) {

						list.addLast(new b(i, j));

						map[i][j] = id;

						id++;

					}

					if (z == 2) {

						start = new b(i, j);

						list.addFirst(start);

						map[i][j] = 0;

					}

				}

			}

			int n = list.size();

			boolean[][] reachableS = new boolean[n][n];

			int[][] reachableP = new int[n][n];



			for (int i = 0; i < h; i++) {

				for (int j = 0; j < w; j++) {

					if (map[i][j] != -1) {

						int dst = map[i][j];

						int rP = 0;

						for (int k = j + 1; k < w; k++) {

							if (map[i][k] != -1) {

								int dpt = map[i][k];

								reachableS[dpt][dst] = true;

								reachableS[dst][dpt] = true;

								reachableP[dpt][dst] = rP;

								reachableP[dst][dpt] = rP;

								rP |= (1 << map[i][k]);

							}

						}

					}

				}

			}

			for (int j = 0; j < w; j++) {

				for (int i = 0; i < h; i++) {

					if (map[i][j] != -1) {

						int dst = map[i][j];

						int rP = 0;

						for (int k = i + 1; k < h; k++) {

							if (map[k][j] != -1) {

								int dpt = map[k][j];

								reachableS[dpt][dst] = true;

								reachableS[dst][dpt] = true;

								reachableP[dpt][dst] = rP;

								reachableP[dst][dpt] = rP;

								rP |= (1 << map[k][j]);

							}

						}

					}

				}

			}



			boolean[] used = new boolean[n];

			System.out.println(rec(used,0,0,reachableS,reachableP));

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}