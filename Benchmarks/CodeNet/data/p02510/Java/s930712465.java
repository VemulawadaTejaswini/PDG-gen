import java.io.*;
import java.util.*;

public class Main {
	
	public static String shuffle(String card, int num) {
		String ans = "";
		for (int i = num; i < card.length(); i++) {
			ans += card.charAt(i);
		}
		return ans + card.substring(0,num);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> ans = new ArrayList<String>();
		String card;
		int shuffle;
		
		while(true) {
			
			card = br.readLine();
			if(card.equals("-")) break;
			shuffle = Integer.parseInt(br.readLine());
			for (int i = 1; i <= shuffle; i++)
				card = shuffle(card, Integer.parseInt(br.readLine()));
			ans.add(card);
			
		}
		for (String s : ans) {
			System.out.println(s);
		}
		
	}
	
}