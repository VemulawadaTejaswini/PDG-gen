import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	HashMap<String, Integer> h = new HashMap<String, Integer>();



	void run(){

		for(;sc.hasNext();){

			String k = sc.next();

			if(h.containsKey(k)){

				h.put(k,h.get(k)+1);

			}else{

				h.put(k, 1);

			}

		}

		int maxch = 0;

		String maxlen = "";

		int maxcount = 0;

		String freq = "";

		for(String k :h.keySet()){

			if(k.length() > maxch){

				maxch = k.length();

				maxlen = k;

			}

			if(h.get(k) > maxcount){

				maxcount = h.get(k);

				freq = k;

			}

		}

		System.out.println(freq + " " + maxlen);

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

		

	}

}