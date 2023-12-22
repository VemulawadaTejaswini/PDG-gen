import java.util.*;
import java.io.*;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String turn = s.next();
		Integer tarou = 0;
		Integer hanako = 0;
		for(int i = 0; i < Integer.parseInt(turn); i++){
			String tarou_card = s.next();
			String hanako_card = s.next();
			Integer result = tarou_card.compareTo(hanako_card);
			if(result == 0){
			if(tarou_card.equals(hanako_card)){
				tarou += 1;
				hanako += 1;
			}
			}
			else if(result > 0){
				tarou += 3;
			}
			else{
				hanako += 3;
			}
		}
		s.close();
		System.out.println(tarou + " " + hanako);
	}
}