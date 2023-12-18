

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String p = scan.nextLine();
		if(ringJad(s, p)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

	static boolean ringJad(String s, String p){
		Boolean jad = true;
		//StringBuilder sb = new StringBuilder(s);
		//while(p.length() >= s.length()){
			s = s+s;
		//}
		System.out.println(s);
		if(!(s.indexOf(p) >= 0)){
			jad = false;
		}
		return jad;


	}

}