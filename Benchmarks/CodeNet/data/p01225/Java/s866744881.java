package Rummy;

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
		String ans = "";
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
			if(numSearch(R)){
				System.out.println("1");
				return;
			}
		}
		if(3 <= G.size()){
			Collections.sort(G);
			if(numSearch(G)){
				System.out.println("1");
				return;
			}
		}
		if(3 <= B.size()){
			Collections.sort(B);
			if(numSearch(B)){
				System.out.println("1");
				return;
			}else{
				System.out.println("0");
				return;
			}
		}else{
			System.out.println("0");
			return;
		}
	}


	private static boolean numSearch(ArrayList<Integer> r) {
		int i = 0;
		if(r.size() == 3){
			if( r.get(0) == r.get(1) && r.get(0) == r.get(2) ) return true;
			if( r.get(0) == r.get(1)-1 && r.get(0) == r.get(2)-2 ) return true;
		}
		return false;
	}

}