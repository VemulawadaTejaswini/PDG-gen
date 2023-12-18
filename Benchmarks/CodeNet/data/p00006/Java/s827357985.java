import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.reverseSequence();
		return;
	}
	
	//文字列の反転
	private void reverseSequence() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		try {
			String inputStr = bufferedReader.readLine();
			StringBuffer stringBuffer = new StringBuffer(inputStr);
			String outputStr = stringBuffer.reverse().toString();
			System.out.println(outputStr);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}