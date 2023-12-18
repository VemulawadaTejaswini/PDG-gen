import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.fishingSheetCalculation();
		return;
	}
	
	//1000円を出した場合のお釣りの枚数を計算する
	private void fishingSheetCalculation() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		try {
			
			String inputStr = bufferedReader.readLine();
			int paymentAmountNum = Integer.parseInt(inputStr); //支払金額を計算
			int fishingNum = 1000 - paymentAmountNum; //お釣りの金額を計算
			
			int coinSheetsNum = 0; //お釣りとして渡す硬貨の枚数
			while (true) {
				
				if (fishingNum >= 500) {
					fishingNum = fishingNum - 500;
					coinSheetsNum++;
				} else if (fishingNum >= 100) {
					fishingNum = fishingNum - 100;
					coinSheetsNum++;
				} else if (fishingNum >= 50) {
					fishingNum = fishingNum - 50;
					coinSheetsNum++;
				} else if (fishingNum >= 10) {
					fishingNum = fishingNum - 10;
					coinSheetsNum++;
				} else if (fishingNum >= 5) {
					fishingNum = fishingNum - 5;
					coinSheetsNum++;
				} else if (fishingNum >= 1) {
					fishingNum = fishingNum - 1;
					coinSheetsNum++;
				} else if (fishingNum == 0) {
					break;
				}
				
			}
			
			System.out.println(coinSheetsNum);
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}
}