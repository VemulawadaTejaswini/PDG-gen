import java.io.*;
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in))); 
		String card = "";
		Integer shaffle_time = 0;
		while(s.hasNext()){
			String input = s.next();
			if(input.equals("-")){
				System.out.println(card);
				break;
			}
			try{
				shaffle_time = Integer.parseInt(input);
				card = card.substring(shaffle_time, card.length()) + card.substring(0, shaffle_time);
			}
			catch(NumberFormatException e){
				if(card == ""){
					card = input;
				}
				else{
					System.out.println(card);
					card = input;
				}
				s.next();
			}
		}
		s.close();
	}
}