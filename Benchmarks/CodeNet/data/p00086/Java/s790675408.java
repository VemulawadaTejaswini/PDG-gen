import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		for(;sc.hasNextLine();){

			LinkedList<Integer> v = new LinkedList<Integer>();

			v.add(1);

			v.add(2);

			for(;;){

				int a = sc.nextInt();

				int b = sc.nextInt();

				if((a|b)==0) break;

				if(v.contains((Object)a)){

					v.remove((Object)a);

				}else{

					v.add(a);

				}

				a = b;

				if(v.contains((Object)a)){

					v.remove((Object)a);

				}else{

					v.add(a);

				}

			}

			System.out.println(v.isEmpty()?"OK":"NG");

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}