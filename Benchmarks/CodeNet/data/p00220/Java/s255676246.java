import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.convertBinaryReal();
		return;
	}
	
	//実数を2進数に変換する
	private void convertBinaryReal() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		while (true) {
			
			try {
				
				String inputStr = bufferedReader.readLine();
				double num = Double.parseDouble(inputStr);
				
				if (num < 0) {
					break;
				}
				
				//入力された値を左シフトする
				num = num * 16;
				
				//1.0で割り切れなければ、小数部4桁に収まらない
				if(num % 1.0 != 0){
					System.out.println("NA");
					continue;
				}
				
				//入力された値が256以上なら整数部8桁に収まらない
				if(num >= 256 * 16){
					System.out.println("NA");
					continue;
				}
				
				String binary = Integer.toBinaryString((int)num);
				
				String integer = binary.substring(0, binary.length() - 4); //小数部を切り落とす
				String minority = binary.substring(binary.length() - 4, binary.length()); //整数部を切り落とす
				
				//整数部が8桁でなければ、足りない桁を0で埋める
				while(integer.length() < 8) {
					integer = "0" + integer;
				}
				
				System.out.println(integer + "." + minority);
				
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
		}
	}
}