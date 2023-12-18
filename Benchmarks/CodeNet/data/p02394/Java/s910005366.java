import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] arr = str.split(" ");
			
			int W = Integer.parseInt(arr[0]);
			int H = Integer.parseInt(arr[1]);
			int x = Integer.parseInt(arr[2]);
			int y = Integer.parseInt(arr[3]);
			int r = Integer.parseInt(arr[4]);
			
			if((x >= r && y >= r) && (x + r <= W && y + r <= H)) System.out.println("Yes");
			else System.out.println("No");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}