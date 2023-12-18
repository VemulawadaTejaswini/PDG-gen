import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.lunchMinimumValueCalculation();
		return;
	}
	
	//昼食の代金の最小値を求める
	private void lunchMinimumValueCalculation() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		LinkedList<Integer> pastaPriceList = new LinkedList<Integer>();
		LinkedList<Integer> juicePriceList = new LinkedList<Integer>();
		
		try {
			
			for (int i = 0; i < 3; i++) {
				String inputStr = bufferedReader.readLine();
				pastaPriceList.add(Integer.parseInt(inputStr));
			}
			
			for (int i = 0; i < 2; i++) {
				String inputStr = bufferedReader.readLine();
				juicePriceList.add(Integer.parseInt(inputStr));
			}
			
			Collections.sort(pastaPriceList);
			Collections.sort(juicePriceList);
			
			int pastaPriceNum = pastaPriceList.get(0);
			int juicePriceNum = juicePriceList.get(0);
			
			System.out.println((pastaPriceNum + juicePriceNum) - 50);
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}
}