import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		String A = "1100000011";

		String B = "1000000010000000100000001";

		String C = "1111";

		String D = "1000000110000001";

		String E = "11000000011";

		String F = "100000001100000001";

		String G = "110000011";

		

		for(;sc.hasNext();){

			String buffer = sc.nextLine();

			if(buffer.length() < 8){

				continue;

			}

			for(int i =1; i < 8; i++){

				buffer+= sc.nextLine();

			}

			if(buffer.indexOf(A) != -1){

				System.out.println("A");			

			}

			if(buffer.indexOf(B) != -1){

				System.out.println("B");			

			}

			if(buffer.indexOf(C) != -1){

				System.out.println("C");			

			}

			if(buffer.indexOf(D) != -1){

				System.out.println("D");			

			}

			if(buffer.indexOf(E) != -1){

				System.out.println("E");			

			}

			if(buffer.indexOf(F) != -1){

				System.out.println("F");			

			}

			if(buffer.indexOf(G) != -1){

				System.out.println("G");			

			}

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

		

	}

}