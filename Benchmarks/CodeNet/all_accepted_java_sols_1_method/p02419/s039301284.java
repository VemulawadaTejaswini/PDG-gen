import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next().toLowerCase();
		int c = 0;
		
		while (true) {
			String key = sc.next();
			if(key.equals("END_OF_TEXT")) break;
			if(word.equals(key.toLowerCase())) c++;
			
		}
		
		System.out.println(c);
	}
}
