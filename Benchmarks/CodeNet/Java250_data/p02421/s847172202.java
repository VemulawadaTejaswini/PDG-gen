import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 0;
		int[] score = new int[2];
		
		try {
			n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				String[] cardStr = br.readLine().split("\\s");
				if (cardStr[0].compareToIgnoreCase(cardStr[1]) > 0) {
					score[0] = score[0] +3;
				} else if (cardStr[0].compareToIgnoreCase(cardStr[1]) < 0) {
					score[1] = score[1] +3;
				} else {
					score[0] = score[0] +1;
					score[1] = score[1] +1;
				}
			}
			System.out.println(score[0] + " " + score[1]);
			
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}

}

