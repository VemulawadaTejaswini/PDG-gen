//package gfg;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char c=br.readLine().trim().charAt(0);
		if(c>=96) {
			System.out.println("a");
		}
		else {
			System.out.println("A");	
		}
		
		
		
	}

}
