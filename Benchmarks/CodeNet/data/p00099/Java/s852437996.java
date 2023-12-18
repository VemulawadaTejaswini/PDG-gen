import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

		if(numPlayer >= 1 && numPlayer <= 1000000 && numEvents >= 1 && numEvents <= 100000){

			for(int iEvent = 0; iEvent < numEvents; iEvent++){
				//String[] winnerFishes = input.nextLine().split(" ");
				int winner = input.nextInt();//Integer.parseInt(winnerFishes[0]);
				int numFish = input.nextInt();//Integer.parseInt(winnerFishes[1]);

				if(winner >= 1 && winner <= numPlayer && numFish >= -100 && numFish <= 100 && numFish != 0){
					int tmpNumFish = 0;
					if(winnerFishesMap.containsKey(winner)){
						tmpNumFish = winnerFishesMap.get(winner);
					}

					winnerFishesMap.put(winner, tmpNumFish + numFish);

					List<Entry<Integer,Integer>> winnerFishesEntryList = new ArrayList<Entry<Integer,Integer>>(winnerFishesMap.entrySet());

					Collections.sort(winnerFishesEntryList, new Comparator<Entry<Integer,Integer>>(){
		                public int compare(Entry<Integer,Integer> o1, Entry<Integer,Integer> o2){
		                    return o2.getValue().compareTo(o1.getValue());
		                }
		            });

					Iterator<Entry<Integer,Integer>> winnerFishesEntryItr = winnerFishesEntryList.iterator();
					Entry<Integer,Integer> tmpEntry = winnerFishesEntryItr.next();
					int bestWinner	= tmpEntry.getKey();
					int bestFish	= tmpEntry.getValue();
					while(winnerFishesEntryItr.hasNext()){
						Entry<Integer,Integer> tmpWinnerFishesEntry = winnerFishesEntryItr.next();
						if(bestFish == tmpWinnerFishesEntry.getValue() && bestWinner > tmpWinnerFishesEntry.getKey()){
							bestWinner	= tmpWinnerFishesEntry.getKey();
							bestFish	= tmpWinnerFishesEntry.getValue();
						}
					}
					System.out.println(bestWinner + " " + bestFish);
				}
			}
		}
		input.close();
	}

}