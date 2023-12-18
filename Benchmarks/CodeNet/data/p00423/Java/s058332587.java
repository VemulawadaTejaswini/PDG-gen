import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		printAnswer();
	}

	private static void printAnswer() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int pointA =0;
			int pointB =0;
			int numOfCardsSet = Integer.valueOf(br.readLine());//??????????????§????????????????????????

			while(true){
				if(numOfCardsSet != 0){
					for(int i = 0; i < numOfCardsSet; i++){
						String[] cardsSet = br.readLine().split(" ");
						int cardA = Integer.valueOf(cardsSet[0]);
						int cardB = Integer.valueOf(cardsSet[1]);

						if(cardA > cardB){
							pointA += cardA + cardB;
						} else if(cardA < cardB){
							pointB += cardA + cardB;
						} else {
							pointA += cardA;
							pointB += cardB;
						}
					}
					System.out.println(pointA + " " + pointB);
					pointA = 0;
					pointB = 0;
					numOfCardsSet =  Integer.valueOf(br.readLine());
				}else {
					break;
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