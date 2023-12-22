import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a=0,b=0;

		try {
			String str = br.readLine();

			a = Integer.parseInt(str.substring(0, str.indexOf(" ")));
			b = Integer.parseInt(str.substring(str.indexOf(" ")+1, str.length()));

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		System.out.print((int)a/b + " " + a%b + " ");
		System.out.printf("%.5f\n",(double)a/b);
	}
}