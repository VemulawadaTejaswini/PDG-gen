import java.io.*;

import java.util.*;



class Main{

	public static void check_ball(ArrayList<Integer> ball_list){

		ArrayList <Integer> cb = new ArrayList<Integer>();
		ArrayList <Integer> cc = new ArrayList<Integer>();
		int pri = 0;
		boolean ch = true;


		cb.add(ball_list.get(0));
		cc.add(ball_list.get(1));

		for(int i=2;i<ball_list.size();i++){
			if(cb.get(cb.size()-1) > ball_list.get(i)){
				if(cc.get(cc.size()-1) > ball_list.get(i)){
					System.out.println("NO");
					ch = false;
					break;
				}
			}
			if(cb.get(cb.size()-1) > cc.get(cc.size()-1)){
				if(cb.get(cb.size()-1) < ball_list.get(i))
					cb.add(ball_list.get(i));
				else cc.add(ball_list.get(i));
			}
			else{
				if(cc.get(cc.size()-1) < ball_list.get(i))
					cc.add(ball_list.get(i));
				else cb.add(ball_list.get(i));
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
				inp.clear();
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