

import java.util.Scanner;
public class Main {

	public static String s;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		sc.close();
		
		if("".equals(s)) {
			System.out.println("Cat");
			return;
		}
		
		boolean flag = true;
		while(flag) {
			flag = mewmew();
		}
		
		System.out.println(s.equals("@") ? "Cat" : "Rabbit");
		
	}
	
	public static boolean mewmew() {
		
		if(s.contains("mew")) {
			s = s.replaceAll("mew", "@");
			return true;
		}

		if(s.contains("m@e@w")) {
			s = s.replaceAll("m@e@w", "@");
			return true;
		}
		
		if(s.contains("m@ew")) {
			s = s.replaceAll("m@ew", "@");
			return true;
		}
		
		if(s.contains("me@w")) {
			s = s.replaceAll("me@w", "@");
			return true;
		}
		
		return false;
	}

}

