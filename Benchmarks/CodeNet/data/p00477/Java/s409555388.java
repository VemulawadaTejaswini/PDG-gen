import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.totalTimeCalculation();
		return;
	}
	
	private void totalTimeCalculation() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		try {
			
			int totalTime = 0;
			
			for (int i = 0; i < 4; i++) {
				String inputStr = bufferedReader.readLine();
				totalTime += Integer.parseInt(inputStr);
			}
			
			int minuteTime = totalTime / 60;
			int secondTime = totalTime % 60;
			
			System.out.println(minuteTime);
			System.out.println(secondTime);
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
			
	}
	
}