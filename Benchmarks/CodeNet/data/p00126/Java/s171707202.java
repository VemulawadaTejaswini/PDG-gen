

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	int zp(int i,int j){

		int ret = 0;

		ret += i%3;

		ret *= 3;

		ret += j%3;

		return ret;

	}

	int zy(int i, int j, int z){

		int ret = 0;

		ret += j/3;

		ret *= 3;

		ret += z%3;

		return ret;

	}

	int zx(int i, int j, int z){

		int ret = 0;

		ret += i/3;

		ret *= 3;

		ret += z/3;

		return ret;

	}

	

	void run(){

		int n = sc.nextInt();

		for(int x =0; x < n ; x++){

			if(x!=0){

				System.out.println();

			}

			int map[][] = new int[9][9];

			for(int i = 0; i < 9 ; i++){

				for(int j = 0; j < 9; j++){

					map[i][j] = sc.nextInt();

				}

			}

			for(int i = 0; i < 9 ; i++){

				for(int j = 0; j < 9; j++){

					boolean aster = false;

					for(int k = 0 ; k < 9 ; k ++){

						if(i == k)

							continue;

						aster = aster || (map[k][j] == map[i][j]);

					}

					for(int k = 0 ; k < 9 ; k ++){

						if(j == k)

							continue;

						aster = aster || (map[i][k] == map[i][j]);

					}

					for(int z = 0 ; z < 9; z ++){

						if(z == zp(i, j))

							continue;

						aster = aster || (map[i][j] == map[zx(i,j,z)][zy(i,j,z)]);						

					}

					System.out.print(aster?'*':' ');

					System.out.print(map[i][j]);

				}

				System.out.println();

			}

			

		}		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}