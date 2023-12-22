import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = null;
		int count = 0;
		try {
			word = br.readLine();
			while(true) {
				String sentence = br.readLine();
				
				if ("END_OF_TEXT".equals(sentence)) {
					break;
				}
				
				String[] tmpArr = sentence.split("\\s");
				for (int i = 0; i < tmpArr.length; i++) {
					if (tmpArr[i].equalsIgnoreCase(word)) {
						count++;
					}
				}
			}
			
			
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println(count);
		
	}

}

