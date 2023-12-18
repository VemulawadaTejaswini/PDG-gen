import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String tmp = br.readLine();
			
			if(tmp == null){
				break;
			}
			
			String[] tmpArray = tmp.split(",");
			
			int[] cards = new int[5];
			int[] appears = new int[13];
				for(int i = 0; i < 5; i++){
				cards[i] = Integer.parseInt(tmpArray[i]);
				appears[cards[i] - 1]++;
			}
			
			Arrays.sort(cards);
			
	
			boolean fourcards = false;
			boolean threecards = false;
			int pair = 0;
			//4cards
			for(int i = 0; i < 13; i++){
				if(appears[i] >= 4 ){
					fourcards = true;
					break;
				}
				if(appears[i] == 3){
					threecards = true;
				}
				if(appears[i] == 2){
					pair++;
				}
			}
			
			boolean straight = false;
			if(cards[0]==1 && cards[1] == 10 && cards[2] == 11 && cards[3] == 12 && cards[4] == 13){
				straight = true;
			}
			else {
				straight = true;
				for(int j = 1; j < 5; j++){
					if(cards[j] != cards[0] + j){
						straight = false;
						break;
					}
				}
			}
			
			if(fourcards){
				System.out.println("four card");
			}
			else if(threecards && pair == 1){
				System.out.println("full house");
			}
			else if(straight){
				System.out.println("straight");
			}
			else if(threecards){
				System.out.println("three card");
			}
			else if(pair == 2){
				System.out.println("two pair");
			}
			else if(pair == 1){
				System.out.println("one pair");
			}
			else {
				System.out.println("null");
			}
			
		}
	}

}