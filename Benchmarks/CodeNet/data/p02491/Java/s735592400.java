import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		try {
			str = br.readLine();

			int a = Integer.parseInt(str.substring(0, str.indexOf(" ")));
			int b = Integer.parseInt(str.substring(str.indexOf(" "), str.length()));

			System.out.print(a/b + " " + a%b);
			System.out.printf("%.5f",(double)a/b);

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}