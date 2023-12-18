import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	class taple{

		double x;

		double y;

		taple(double x,double y){

			this.x = x;

			this.y = y;

		}

		taple getRightDir(){

			taple dir = new taple(-y,x);

			taple ret = new taple(0,0);

			ret.x = dir.x/Math.sqrt(dir.x*dir.x+dir.y*dir.y);

			ret.y = dir.y/Math.sqrt(dir.x*dir.x+dir.y*dir.y);

			return ret;

		}

		taple add(taple t){

			return new taple(t.x+x,t.y+y);

		}

	}

	void run(){

		taple[] t= new taple[1001];

		t[0] = new taple(1, 0);

		for(int i = 1; i < 1001; i++){

			t[i] = t[i-1].add(t[i-1].getRightDir());

//			System.out.println(i+" "+t[i-1].getRightDir().x + " "+t[i-1].getRightDir().y);

//			System.out.println(i+" "+t[i].x+" "+t[i].y);

		}

		for(;;){

			int n =sc.nextInt();

			if(n == -1) break;

			System.out.println(t[n-1].x + "\n"+t[n-1].y);

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}