import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str;
			int i = 1;
			int j;
			while((str = br.readLine()) !=  null){
				j = Integer.parseInt(str);
				if(j == 0) {
					break;
				}
				System.out.println("Case " + i + ": " + str);
				i++;
			}
			br.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}