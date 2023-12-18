

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			 
			String a = sc.nextLine();
			String b[] = a.split("\\s+");
			
			System.out.println(b[1]+b[0]);
			
			
		}
		
	}

}
