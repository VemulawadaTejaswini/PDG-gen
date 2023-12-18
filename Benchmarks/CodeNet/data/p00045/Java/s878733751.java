import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		int sum=0,c=0;

		double o=0;

		for(;sc.hasNextLine();c++){

			String buf = sc.nextLine();

			Scanner m = new Scanner(buf.replace(',',' '));

			int a =m.nextInt();

			int b =m.nextInt();

			sum += a*b;

			o += b;

		}

		System.out.println(sum+"\n"+(int)(o/c + 0.5));

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}