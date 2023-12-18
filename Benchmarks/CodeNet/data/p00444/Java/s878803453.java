import java.util.Scanner;

class Main{
	static int change = 0;//お釣り
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int paymentAmont = 1000;//支払い金額
		
		while(true){
			int amountShopping = stdIn.nextInt();//買い物金額
			if(amountShopping == 0)break;
			change = paymentAmont - amountShopping;
	
			int coin500 = getCoinNumberOfSheets(500);//釣りの500円玉の枚数
			int coin100 = getCoinNumberOfSheets(100);//釣りの100円玉の枚数
			int coin50 = getCoinNumberOfSheets(50);//釣りの50円玉の枚数
			int coin10 = getCoinNumberOfSheets(10);//釣りの10円玉の枚数
			int coin5 = getCoinNumberOfSheets(5);//釣りの5円玉の枚数
			int coin1 = getCoinNumberOfSheets(1);//釣りの1円玉の枚数
			
			System.out.println(coin500+coin100+coin50+coin10+coin5+coin1);
		}
	}
	public static int getCoinNumberOfSheets(int kindOfCoin){
		int countCoin = 0;
		while(change >= kindOfCoin){
			change -= kindOfCoin;
			countCoin++;
		}
		return countCoin;
	}
}