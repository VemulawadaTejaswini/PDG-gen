

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	class data implements Comparable{

		String name;

		int win;

		int lose;

		int draw;

		int point;

		data(String n,int w,int l,int d){

			this.name = n;

			this.win = w;

			this.lose = l;

			this.draw = d;

			this.point = w*3+d;

		}

		@Override

		public int compareTo(Object arg0) {

			return -this.point + ((data)arg0).point;

		}

		@Override

		public String toString() {

			return name+","+point;

		}

	}

	void run(){

		for(;;System.out.println()){

			int n = sc.nextInt();

			if(n == 0)

				break;

			data[] d = new data[n];

			for(int i= 0; i < n ;i ++){

				d[i] = new data(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());

			}

			Arrays.sort(d);

			for(int i = 0; i < n; i++){

				System.out.println(d[i]);

			}

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}