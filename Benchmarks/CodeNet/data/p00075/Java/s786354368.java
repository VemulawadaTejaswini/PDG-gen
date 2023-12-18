import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		for (; sc.hasNextLine();) {

			String buffer = sc.nextLine();

			String[] data = buffer.split(",");

			int id = Integer.valueOf(data[0]);

			double weight = Double.valueOf(data[1]);

			double tall = Double.valueOf(data[2]);

//			System.out.println(id+","+tall+","+weight+"  "+weight/tall/tall);

			if(weight / tall/tall >25 ){

				System.out.println(id);

			}

		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}