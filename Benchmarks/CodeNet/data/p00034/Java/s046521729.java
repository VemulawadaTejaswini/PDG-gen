import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc2 = new Scanner(System.in);

	void run(){

		for(;sc2.hasNextLine();){

			String buffer = sc2.nextLine();

			int[] d = new int[11];

			Scanner sc = new Scanner(buffer.replace(',', ' '));

			d[0] = 0;

			for(int i = 1; i < 11;i++){

				d[i] =d[i-1]+ sc.nextInt();

			}

			int v1 = sc.nextInt();

			int v2 = sc.nextInt();

			int ret = 0;

			for(int i = 0;i<11&& v1*(d[10]-d[i])>v2*(d[i]) ; i++){

				ret = i+1;

			}

			System.out.println(ret);

		}		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

		

	}

}