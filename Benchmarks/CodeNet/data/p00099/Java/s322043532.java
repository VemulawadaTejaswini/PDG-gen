import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Main {

	public static Map<Integer, Integer> winnerFishesMap = new HashMap<Integer,Integer>();


	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		String[] menAndEvents = input.nextLine().split(" ");

		int numPlayer = Integer.parseInt(menAndEvents[0]);
		int numEvents = Integer.parseInt(menAndEvents[1]);

		if(numPlayer >= 1 && numPlayer <= 1000000 && numEvents >= 1 && numEvents <= 100000 && numEvents != 0){

			for(int iEvent = 0; iEvent < numEvents; iEvent++){
				String[] winnerFishes = input.nextLine().split(" ");
				int winner = Integer.parseInt(winnerFishes[0]);
				int numFish = Integer.parseInt(winnerFishes[1]);

				if(winner >= 1 && winner <= numPlayer && numFish >= -100 && numFish <= 100){
					int tmpNumFish = 0;
					if(winnerFishesMap.containsKey(winner)){
						tmpNumFish = winnerFishesMap.get(winner);
					}

					winnerFishesMap.put(winner, tmpNumFish + numFish);

					List<Entry<Integer,Integer>> winnerFishesEntryList = new ArrayList<Entry<Integer,Integer>>(winnerFishesMap.entrySet());


					Iterator<Entry<Integer,Integer>> winnerFishesEntryItr = winnerFishesEntryList.iterator();
					Entry<Integer,Integer> bestWinnerFishEntry = winnerFishesEntryItr.next();
					if(winnerFishesEntryItr.hasNext()){
						Entry<Integer,Integer> tmpWinnerFishesEntry = winnerFishesEntryItr.next();
						if(bestWinnerFishEntry.getValue() < tmpWinnerFishesEntry.getValue()){
							bestWinnerFishEntry = tmpWinnerFishesEntry;
						} else if(bestWinnerFishEntry.getValue() == tmpWinnerFishesEntry.getValue() && bestWinnerFishEntry.getKey() > tmpWinnerFishesEntry.getKey()){
							bestWinnerFishEntry = tmpWinnerFishesEntry;
						}
					}
					System.out.println(bestWinnerFishEntry.getKey() + " " + bestWinnerFishEntry.getValue());
				}
			}
		}
		input.close();
	}

}