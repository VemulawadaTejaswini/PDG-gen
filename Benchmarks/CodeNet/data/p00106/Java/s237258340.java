import java.util.Scanner;

public class Main{
	
	private static final int A = 0;
	private static final int B = 1;
	private static final int C = 2;
	
	private static final int WEIGHT = 0;
	private static final int PRICE = 1;
	private static final int SHOPDISCOUNT_PACK = 3;
	
	private static final int[][] WHEAT = {
		{200, 380},
		{300, 550},
		{500, 850},
		{1000, 1520},
		{1200, 1870},
		{1500, 2244}
	};
	
	public static void main(String[] args){
		int[] price = getMinPrice();
		Scanner sc = new Scanner(System.in);
		int weight = 0;
		while((weight = sc.nextInt()) != 0){
			System.out.println(price[weight]);
		}
		sc.close();
	}
	
	private static final int MAX_WEIGHT = 5001;
	private static final int INF = Integer.MAX_VALUE;
	public static int[] getMinPrice(){
		//initialize
		int[] price = new int[MAX_WEIGHT];
		for(int i = 0; i < price.length; i++){
			price[i] = INF;
		}
		price[0] = 0;
		price[100] = 0;
		
		//solve
		for(int w = 200; w < MAX_WEIGHT; w += 100){
			int tmpPrice = INF;
			for(int i = 0; i < WHEAT.length; i++){
				int sourceWeight = w - WHEAT[i][WEIGHT];
				if(sourceWeight < 0 || sourceWeight == 100)	continue;
				tmpPrice = price[sourceWeight] + WHEAT[i][PRICE];
				price[w] = Math.min(price[w], tmpPrice);
			}
		}
		return price;
	}
	/**
	 * 指定された個数を購入した場合の価格を算出する。
	 */
	public static int getPrice(int vOnA, int vDiscountedOnA, int vOnB, int vDiscountedOnB, int vOnC, int vDiscountedOnC){
		int sum = 0;
		sum += getPriceOn(A, vOnA, vDiscountedOnA);
		sum += getPriceOn(B, vOnB, vDiscountedOnB);
		sum += getPriceOn(C, vOnC, vDiscountedOnC);
		return sum;
	}
	
	private static int getPriceOn(int shop, int volume, int volumeDiscounted){
		int sum = 0;
		sum += WHEAT[shop][PRICE] * volume;
		sum += WHEAT[shop + SHOPDISCOUNT_PACK][PRICE] * volumeDiscounted;
		return sum;
	}
	
}