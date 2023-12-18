import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.notSubmitterSearch();
		return;
	}
	
	//課題の未提出者を検索する
	private void notSubmitterSearch() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		LinkedList<Integer> submitterList = new LinkedList<Integer>(); //提出者のリスト
		
		try {
			
			for (int i = 0; i < 28; i++) {
				String inputStr = bufferedReader.readLine();
				submitterList.add(Integer.parseInt(inputStr));
			}
			
			Collections.sort(submitterList); //番号順に並べ替える
			
			int notSubmitter1 = 0;
			int notSubmitter2 = 0;
			for (int i = 0; i < 28; i++) {
				
				if (i != 27) {
					
					int tmp = submitterList.get(i);
					int tmp2 = submitterList.get(i + 1);
					
					int tmp3 = tmp2 - tmp;
					if (tmp3 != 1 && notSubmitter1 == 0) {
						notSubmitter1 = ++tmp;
					} else if (tmp3 != 1 && notSubmitter2 == 0) {
						notSubmitter2 = ++tmp;
					}
					
				} else if (i == 27) {
					
					int tmp = submitterList.get(i - 1);
					int tmp2 = submitterList.get(i);
					
					int tmp3 = tmp2 - tmp;
					if (tmp3 != 1 && notSubmitter1 == 0) {
						notSubmitter1 = ++tmp;
					} else if (tmp3 != 1 && notSubmitter2 == 0) {
						notSubmitter2 = ++tmp;
					}
					
				}
				
			}
			
			if (notSubmitter1 < notSubmitter2) {
				System.out.println(notSubmitter1);
				System.out.println(notSubmitter2);
			} else if (notSubmitter1 > notSubmitter2) {
				System.out.println(notSubmitter2);
				System.out.println(notSubmitter1);
			} else {
				System.out.println(notSubmitter1);
				System.out.println(notSubmitter2);
			}
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		
		
	}
}