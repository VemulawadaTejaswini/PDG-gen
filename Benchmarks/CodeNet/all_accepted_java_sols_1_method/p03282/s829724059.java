

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		long K = scanner.nextLong();
		
		
		for(int i=0; i<S.length(); i++) {
			char c = S.charAt(i);
			K = (long) (K - Math.pow(Integer.parseInt(Character.toString(c)), 5*Math.pow(10, 15)));
			if(K <= 0) {
				System.out.println(c);
				break;
			}
			
		}
		

	}

}
