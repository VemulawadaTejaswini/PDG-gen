import java.io.*;
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in))); 
		ArrayList<Integer> shaffle_time = new ArrayList<Integer>();
		ArrayList<String> card_set = new ArrayList<String>();
		while(s.hasNext()){
			String input = s.next();
			if(input.equals("-")){
				break;
			}
			try{
				shaffle_time.add(Integer.parseInt(input));
			}
			catch(NumberFormatException e){
				card_set.add(input);
			}
		}
		s.close();
		System.out.println(shaffle_time.size());
		for(int i = 0; i < card_set.size(); i++){
			String card = card_set.get(i);
			for(int j = 0; j < shaffle_time.size(); j++){
				card = card.substring(shaffle_time.get(j), card.length()) + card.substring(0, shaffle_time.get(j));
			}
			System.out.println(card);
		}
	}
}