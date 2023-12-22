import java.util.*;
import java.lang.*;
import java.awt.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] t = new int[26];
		
		while (sc.hasNext()) {
			String s = sc.nextLine();
			for (int i = 0; i<s.length(); i++){
				int countval = s.toLowerCase().codePointAt(i)-97;
				if (countval >= 0) t[countval]++;
				
			}
		}
		
		for (int a=0; a<t.length;a++) {
			System.out.println(String.format("%s : %d", (char)(a+97), t[a]));	
		}
		
		
		
		
	}
}
