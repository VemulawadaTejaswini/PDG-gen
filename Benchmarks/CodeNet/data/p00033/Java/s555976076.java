import java.io.*;

import java.util.*;
import java.util.regex.Pattern;

import java.util.regex.Matcher;

import java.math.*;



class Main{

	public static void check_ball(String list){
		ArrayList <Integer> ball_list = new ArrayList<Integer>();

		ArrayList <Integer> cb = new ArrayList<Integer>();
		ArrayList <Integer> cc = new ArrayList<Integer>();
		boolean ch = true;




		String [] strAry = new String[list.length()];

		strAry = list.split(" ");
		for(int i=0;i<strAry.length;i++){
			Pattern p = Pattern.compile("[0-9]*");

			Matcher m = p.matcher(strAry[i]);

			if(m.find()){

				int x = Integer.valueOf(m.group(0)).intValue();

				ball_list.add(x);
			}
		}

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


	public static void ball(ArrayList<String> list){
		for(int i=0;i<list.size();i++){
			check_ball(list.get(i));			
		}
	}

		

	public static void main(String args[]) throws IOException{

		String str;

		ArrayList <String> inp = new ArrayList<String>();



		Scanner scan = new Scanner(System.in);

		//scan.useDelimiter("\n");

		str = scan.next();


		while(scan.hasNext()){
			str = scan.next();
			inp.add(str);

		}

		ball(inp);

	}

}