import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		final int ALPHABET = 26;
		int count;
		char c, lca = 97, ucl = 65;
		String ch;
		ArrayList<String> data = new ArrayList<String>();
		
		while (scan.hasNext()) {
			ch = scan.next();
			data.add(ch);
		} 
		
		
		for (int i = 0; i < ALPHABET; i++) {
			count = 0;
			for ( int j = 0; j < data.size(); j ++) {
				for (int k = 0; k < data.get(j).length(); k++) {
					c = data.get(j).charAt(k);
					if ( lca == c || ucl == c) {
						count++;
					}
				}				
			}
			
			System.out.println (lca + " : " + count);
			lca++;
			ucl++;
		}
		
		scan.close();
		
	}
}

