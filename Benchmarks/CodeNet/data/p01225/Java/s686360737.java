package aoj.rummy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.nextLine());
		String str = "";
		for (int i = 0; i < T; i++) {
			str = scan.nextLine();
			String[] num = str.split(" ");
			str = scan.nextLine();
			String[] rgb = str.split(" ");
			sort(num, rgb);
		}
	}

	private static void sort(String[] num, String[] rgb) {
		ArrayList<Integer> R = new ArrayList<Integer>();
		ArrayList<Integer> G = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		int cnt = 0;
		for(int i = 0; i < num.length; i++){
			if(rgb[i].equals("R")){
				R.add(Integer.parseInt(num[i]));
			}else if(rgb[i].equals("G")){
				G.add(Integer.parseInt(num[i]));
			}else{
				B.add(Integer.parseInt(num[i]));
			}
		}


		if(R.size()%3 != 0 || G.size()%3 != 0 || B.size()%3 != 0){
			System.out.println("0");
			return;
		}

		if(3 <= R.size()){
			Collections.sort(R);
			cnt += numSearch(R);
		}
		
		if(3 <= G.size()){
			Collections.sort(G);
			cnt += numSearch(G);
			
		}
		if(3 <= B.size()){
			Collections.sort(B);
			cnt += numSearch(B);
			
		}
		
		if(cnt == 3){
			System.out.println("1");
		}else{
			System.out.println("0");
		}
		
	}


	private static int numSearch(ArrayList<Integer> r) {
		int i = 0;
		switch(r.size()){
		case 3:
			if( r.get(0) == r.get(1) && r.get(0) == r.get(2) ) return 1;
			if( r.get(0) == r.get(1)-1 && r.get(0) == r.get(2)-2 ) return 1;

		case 6:
			for (int j = 0; j < 6; j +=3) {
				if( r.get(j) == r.get(j+1) && r.get(j) == r.get(j+2) ) i +=1;
				if( r.get(j) == r.get(j+1)-1 && r.get(j) == r.get(j+2)-2 ) i +=1;
			}
			return i;

		case 9:
			for (int j = 0; j < 9; j +=3) {
				if( r.get(j) == r.get(j+1) && r.get(j) == r.get(j+2) ) i +=1;
				if( r.get(j) == r.get(j+1)-1 && r.get(j) == r.get(j+2)-2 ) i +=1;
			}

			return i;

		}

		return i;


	}

}