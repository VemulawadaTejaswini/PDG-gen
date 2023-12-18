import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		sc.close();
		long total = 0;
		for (char c : num.toCharArray()) {
			total += Integer.parseInt(String.valueOf(c));
		}
		if (total % 9 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
	
	
	
    
    
}