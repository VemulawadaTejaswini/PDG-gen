import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		int n= sc.nextInt();

		for(int i=0; i<n;i++){

			char[] buf = String.valueOf(sc.nextInt()).toCharArray();

			Arrays.sort(buf);

			int a =Integer.valueOf(String.valueOf(buf));

			for(int j =0; j<buf.length/2;j++){

				char t = buf[j];

				buf[j] =buf[buf.length-j-1];

				buf[buf.length-j-1]=t;    

			}

			int b= Integer.valueOf(String.valueOf(buf));

			System.out.println(b-a);

		}

		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

		

	}

}