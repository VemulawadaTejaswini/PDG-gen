package Character;

import java.util.Scanner;

public class main{
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
		s = s+s+s;
		System.out.println(s);
		if(!(s.indexOf(p) >= 0)){
			jad = false;
		}
		return jad;


	}

}