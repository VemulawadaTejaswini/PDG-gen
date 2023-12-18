import java.io.*;

import java.util.*;
import java.util.regex.Pattern;

import java.util.regex.Matcher;

import java.math.*;



class Main{

	public static void check_ball(ArrayList<Integer> ball_list){

		ArrayList <Integer> cb = new ArrayList<Integer>();
		ArrayList <Integer> cc = new ArrayList<Integer>();
		boolean ch = true;


		cb.add(ball_list.get(0));

		for(int i=1;i<ball_list.size();i++){
			if(cb.get(cb.size()-1) < ball_list.get(i)){
				cb.add(ball_list.get(i));
			}
			else if(cc.isEmpty() == true) cc.add(ball_list.get(i));
			else if(cc.get(cc.size()-1) < ball_list.get(i)){
				cc.add(ball_list.get(i));
			}
			else{
				System.out.println("NO");
				ch = false;
				break;
			}
		}
		if(ch == true)System.out.println("YES");
	}


	public static void ball(ArrayList<Integer> list){
		ArrayList <Integer> inp = new ArrayList<Integer>();
		for(int i=0;i<list.size()/10;i++){
				for(int j=0;j<10;j++){
					inp.add(list.get(i*10+j));
				}
				check_ball(inp);
		}			
	}

		

	public static void main(String args[]) throws IOException{

		String str;

		ArrayList <Integer> inp = new ArrayList<Integer>();



		Scanner scan = new Scanner(System.in);

		str = scan.next();


		while(scan.hasNext()){
			str = scan.next();			

			int x = Integer.valueOf(str).intValue();			
			inp.add(x);

		}

		ball(inp);

	}

}