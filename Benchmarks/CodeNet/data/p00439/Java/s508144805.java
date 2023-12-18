import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.maximumSumCalculation();
		return;
	}
	
	//数値の列の中から、連続して並ぶk個の整数の和の最大値を求める
	private void maximumSumCalculation() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		while (true) {
			
			try {

				String inputStr = bufferedReader.readLine();
				String[] inputStrs = inputStr.split(" ");
				int sequenceNum = Integer.parseInt(inputStrs[0]); //数列全体の数
				int integerColumnNum = Integer.parseInt(inputStrs[1]); //kの数
				
				if ((sequenceNum + integerColumnNum) == 0) {
					break;
				}
				
				int[] sequenceArray = new int[sequenceNum]; //数列
				LinkedList<Integer> integerColumnList = new LinkedList<Integer>(); //k個の整数の和のリスト

				for (int i = 0; i < sequenceNum; i++) {

					String inputNumStr = bufferedReader.readLine();
					sequenceArray[i] = Integer.parseInt(inputNumStr);

				}

				for (int i = 0; i < sequenceNum; i++) {

					int tmp = 0;

					try {

						for (int j = 0; j < integerColumnNum; j++) {
							tmp += sequenceArray[j + i];
						}

						integerColumnList.add(tmp);

					} catch (ArrayIndexOutOfBoundsException e) {

						break;

					}

				}

				Collections.sort(integerColumnList);
				Collections.reverse(integerColumnList);

				System.out.println(integerColumnList.get(0));

			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		
	}
}