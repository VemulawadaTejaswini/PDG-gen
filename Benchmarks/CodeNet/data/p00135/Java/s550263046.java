

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	class time{

		int h;

		int m;

		int deg;

		time(String hm){

			String ti[] = hm.split(":");

			h = Integer.parseInt(ti[0]);

			m = Integer.parseInt(ti[1]);

			deg = Math.abs((h*60+m - m*12));

			deg = Math.min(deg, 12*60-deg);

		}

		@Override

		public String toString() {

			if(deg < ((30)*(12*60)/360)){

				return "alert";

			}

			if(deg >= ((90)*(12*60)/360)){

				return "safe";

			}

			return "warning";

		}

	}

	void run(){

		int n = sc.nextInt();

		for(int i= 0; i< n; i++){

			System.out.println(new time(sc.next()));

		}

		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}