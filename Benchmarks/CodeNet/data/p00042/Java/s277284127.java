package jp.ac.innami.volume0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AThief {
	protected static final int MAX_BAG_WEIGHT = 1000;
	protected static final int MAX_NUM_TREASURES = 1000;
	protected static final int MAX_VALUE = 10000;
	protected static final int WEIGHT = 0;
	protected static final int VALUE = 1;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int bagWeight = 0;
		int num_treasures = 0;
		int caseNumber = 1;
		ArrayList<Treasure> treasures;
		Thief thief = new Thief();
		while(true){
			//かばんの最大積載量を受け取る
			bagWeight = Integer.parseInt(br.readLine());
			if(bagWeight == 0) break;
			//異常なかばん最大積載量が入力されたら終了する
			if(bagWeight < 0 || bagWeight > MAX_BAG_WEIGHT) break;
			Bag bag = new Bag(bagWeight);
			thief.setBag(bag);
			//お宝の個数を受け取る
			num_treasures = Integer.parseInt(br.readLine());
			//お宝の数が異常値なら処理を終了する
			if(num_treasures < 1 || num_treasures > MAX_NUM_TREASURES) break;
			//お宝情報を入力から取得
			treasures = new ArrayList<Treasure>();
			for(int i = 0; i < num_treasures; i++){
				String[] inputs = (br.readLine()).split(",");
				int treasureWeight = Integer.parseInt(inputs[WEIGHT]);
				int treasureValue = Integer.parseInt(inputs[VALUE]);
				treasures.add(new Treasure(treasureWeight, treasureValue));
			}
			
			//もっとも軽く、もっとも高価なお宝の組み合わせを選び、かばんにつめる
//			printList(treasures);
			thief.sort(treasures);
			thief.steelTreasures(treasures);
//			printList(treasures);
			
			//かばんの重量とお宝の合計金額を出力する
			System.out.println("Case　" + caseNumber++ + ":");
			System.out.println(bag.getCurrentTreasuresWeight());
			System.out.println(bag.getCurrentTreasuresValue());
		}
	}
	
	private static void printList(ArrayList<Treasure> list){
		System.out.println("current list");
		for(Treasure t : list){
			System.out.println("w:" + t.getWeight() + "v:" + t.getValue() + "v/w:" + t.getValuePerWeight());
		}
	}
}

class Bag{
	private int maxWeight;
	private int currentWeight;
	private ArrayList<Treasure> treasures;
	public Bag(int maxWeight) {
		this.maxWeight = maxWeight;
		treasures = new ArrayList<Treasure>(AThief.MAX_NUM_TREASURES);
	}
	public void addTreasure(Treasure treasure){
		treasures.add(treasure);
	}
	public int getMaxWeight() {
		return maxWeight;
	}
	public int getCurrentTreasuresValue(){
		int sumOfValue = 0;
		for(Treasure t : treasures){
			sumOfValue += t.getValue();
		}
		return sumOfValue;
	}
	public int getCurrentTreasuresWeight(){
		int sumOfWeight = 0;
		for(Treasure t : treasures){
			sumOfWeight += t.getWeight();
		}
		return sumOfWeight;
	}
}

class Treasure{
	private int weight;
	private int value;
	private double valuePerWeight;
	public Treasure(int weight, int value) {
		this.weight = weight;
		this.value = value;
		valuePerWeight = (double)value / (double)weight;
	}
	public int getValue() {
		return value;
	}
	public int getWeight() {
		return weight;
	}
	public double getValuePerWeight() {
		return valuePerWeight;
	}
}

class Thief{
	private Bag bag;
	public void setBag(Bag bag) {
		this.bag = bag;
	}
	public void steelTreasures(ArrayList<Treasure> treasuresSorted){
		for(int i = treasuresSorted.size() - 1; i >= 0; i--){
			//重量当たりの価値が高いお宝から重量の許す限り、袋につめる
			if(bag.getCurrentTreasuresWeight() + treasuresSorted.get(i).getWeight() <= bag.getMaxWeight()){
				bag.addTreasure(treasuresSorted.get(i));
			}
			else{
				//DO NOTHING
			}
		}
	}
	
	public void sort(ArrayList<Treasure> treasures){
		Collections.sort(treasures, new Comparator<Treasure>() {
			@Override
			public int compare(Treasure o1, Treasure o2) {
				double w1 = o1.getValuePerWeight();
				double w2 = o2.getValuePerWeight();
				int difference = Double.compare(w1, w2);
//				check result of values comparing
//				System.out.println(w1 + ((difference > 0)? " gt "  : " not gt ") + w2);
				return difference;
			}
		});
	}
	
	public void introduce(){
		System.out.println("My name is Lupin the THIRD.");
	}
}