import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void rec(int[][] map ,int i, int j, int count){

		map[i][j] = count;

		int[] x = {1,-1,0,0};

		int[] y = {0,0,1,-1};

		for(int d=0;d<4;d++){

			int ni = i+x[d];

			int nj = j+y[d];

			if(map[ni][nj] == 1){

				rec(map,ni,nj,count);

			}			

		}

	}

	

	void run(){

		for(;sc.hasNextLine();){

			int[][] map = new int[14][14];

			boolean c = false;

			for(int i=0;i<12;i++){

				String l = sc.nextLine();

				if(l.length() == 0){

					c=true;

					break;

				}

				for(int j =0; j <12;j++){

					map[i+1][j+1] = l.charAt(j)-'0';

				}

			}

			if(c) continue;

			int count = 0;

			for(int i = 1; i<13; i++){

				for(int j= 1; j < 13;j++){

					if(map[i][j] == 1){

						rec(map,i,j, count++ + 2);

					}

				}

			}

			System.out.println(count);

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}