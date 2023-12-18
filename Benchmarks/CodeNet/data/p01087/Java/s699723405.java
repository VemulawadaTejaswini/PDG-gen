

import java.util.ArrayList;
import java.util.Scanner;
public class Main {


	static int n;
	static ArrayList<String> str;
	static ArrayList<Integer> slong;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int n;
//		ArrayList<String> str;
//		ArrayList<Integer> slong;
		
		while(true) {
		n = Integer.parseInt(sc.nextLine());
		if(n == 0) {break;}
		if(n == 1) {
			System.out.println(sc.nextLine());
			continue;
		}
		str = new ArrayList<String>();
		slong = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			str.add(sc.nextLine());
			slong.add(str.get(i).length()-1);
			str.set(i, str.get(i).substring(slong.get(i)));
		}

		str.add("");
		slong.add(-1);
		
		while(n > 2) {
			calc();
		}
		System.out.println(str.get(1));
		
		}
		sc.close();
	}

	public static void calc() {
		int longest=0;
		int pos=0;
		for(int i=0;i<n;i++) {
			if(slong.get(i) > longest) {
				longest =  slong.get(i);
				pos = i;
			}
		}
		
		if(slong.get(pos+1) == slong.get(pos)) {
			if(str.get(pos-1).equals("+")) {
				str.set(pos, String.valueOf(Integer.parseInt(str.get(pos)) + Integer.parseInt(str.get(pos+1))));
			}else {
				str.set(pos, String.valueOf(Integer.parseInt(str.get(pos)) * Integer.parseInt(str.get(pos+1))));
			}
			str.remove(pos+1);
			slong.remove(pos+1);
			n --;
		}else {
			str.remove(pos-1);
			slong.set(pos, slong.get(pos)-1);
			slong.remove(pos-1);
			n--;
		}
		
		
	}
	
}

