import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		HashMap< Character, Integer> h = new HashMap<Character, Integer>();

		h.put('I',1);//I Í1, 

		h.put('V',5);//V Í5,

		h.put('X',10);//X Í10, 

		h.put('L',50);//L Í50, 

		h.put('C',100);// C Í100,

		h.put('D',500);// D Í500,

		h.put('M',1000);//M Í1000

		for(;sc.hasNext();){

			String s = sc.next();

			int prev =0;

			int sum = 0;

			for(int i = s.length()-1; i >= 0; i--){

				int value= h.get(s.charAt(i));

				if(prev <= value){

					sum += value;

				}else{

					sum -= value;

				}

				prev = value;

			}

			System.out.println(sum);

		}

		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

		

	}

}