
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	private static final int NUM_HAND_CARD = 5;
	public static void main(String[] arg){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] hand = new int[NUM_HAND_CARD];
		ArrayList<String> result = new ArrayList<String>();
		try{
			while(true){
				String[] input = br.readLine().split(",");
				for(int i = 0; i < NUM_HAND_CARD; i++){
					hand[i] = Integer.parseInt(input[i]);
				}
				result.add(judgeHand(hand));
			}
		}catch(Exception e){
			//何もしないで出力処理に移る
		}
		
		for(String pair : result){
			System.out.println(pair);
		}
	}
	
	public static String judgeHand(int[] hand){
		Arrays.sort(hand);
		if(isFourCard(hand)){
			return "four card";
		}
		else if(isFullHouse(hand)){
			return "full house";
		}
		else if(isStraight(hand)){
			return "straight";
		}
		else if(isThreeCard(hand)){
			return "three card";
		}
		else if(isTwoPair(hand)){
			return "two pair";
		}
		else if(isOnePair(hand)){
			return "one pair";
		}
		else{
			return null;
		}
	}
	
	private static boolean isFourCard(int[] hand){
		return isPair(hand ,4, 1);
	}
	
	private static boolean isFullHouse(int[] hand){
		if(isOnePair(hand) && isThreeCard(hand)){
			return true;
		}
		else{
			return false;
		}
	}

	private static boolean isStraight(int[] hand){
		int[] tmpHand = new int[NUM_HAND_CARD];
		for(int i = 0; i < NUM_HAND_CARD; i++){
			tmpHand[i] = hand[i];
			if(tmpHand[i] == 1){
				tmpHand[i] = 14;
			}
		}
		Arrays.sort(tmpHand);
		return checkNumbersStraight(hand) || checkNumbersStraight(tmpHand);
	}
	
	private static boolean checkNumbersStraight(int[] hand){
		int numStart = hand[0];
		for(int i = 1; i < NUM_HAND_CARD; i++){
			if(++numStart != hand[i]){
				return false;
			}
		}
		return true;
	}

	private static boolean isThreeCard(int[] hand){
		return isPair(hand, 3, 1);
	}

	private static boolean isTwoPair(int[] hand){
		return isPair(hand, 2, 2);
	}

	private static boolean isOnePair(int[] hand){
		return isPair(hand, 2, 1);
	}
	
	//同じカードnumCard枚のペアがnumPair組あるか判定する
	private static boolean isPair(int[] hand, int numCard, int numPair){
		//Arrays.sort(hand);
		int pairCount = 0;
		for(int n = 1; n <= 13; n++){
			int count = 0;
			for(int i = 0; i < NUM_HAND_CARD; i++){
				if(hand[i] == n){
					count++;
				}
			}
			if(count == numCard){
				pairCount++;
			}
		}
		if(pairCount == numPair){
			return true;
		}
		else{
			return false;
		}
	}

}