import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		printAnswer();
	}

	private static void printAnswer() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			Map<Integer ,String> spade = new HashMap<>();
			Map<Integer ,String> heart = new HashMap<>();
			Map<Integer ,String> crub = new HashMap<>();
			Map<Integer ,String> dia = new HashMap<>();
			int numOfCards = Integer.valueOf(br.readLine());
			for(int i = 0; i < numOfCards; i++){
				String[] cardsSet = br.readLine().split(" ");
				String print = cardsSet[0];
				int rank = Integer.valueOf(cardsSet[1]);
				if(print.equals("S")){
					spade.put(rank, print);
				}
				if(print.equals("H")){
					heart.put(rank, print);
				}
				if(print.equals("C")){
					crub.put(rank, print);
				}
				if(print.equals("D")){
					dia.put(rank, print);
				}
			}

			for(int i = 1; i < 14 ; i++){
				if(!spade.containsKey(i)){
					System.out.println("S " + i);
				}
			}
			for(int i = 1; i < 14 ; i++){
				if(!heart.containsKey(i)){
					System.out.println("H " + i);
				}
			}
			for(int i = 1; i < 14 ; i++){
				if(!crub.containsKey(i)){
					System.out.println("C " + i);
				}
			}
			for(int i = 1; i < 14 ; i++){
				if(!dia.containsKey(i)){
					System.out.println("D " + i);
				}
			}

		} catch (IOException e) {
			Logger.getGlobal();
			throw new RuntimeException(e);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				Logger.getGlobal();
			}
		}
	}

}