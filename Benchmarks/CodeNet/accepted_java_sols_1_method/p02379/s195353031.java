import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] strArr = br.readLine().split("\\s");
		      double[] p1 = {Double.parseDouble(strArr[0]), Double.parseDouble(strArr[1])};
		      double[] p2 = {Double.parseDouble(strArr[2]), Double.parseDouble(strArr[3])};
		      
		      double ans = Math.sqrt(Math.pow((p1[0] - p2[0]), 2) + Math.pow(p1[1] - p2[1], 2));
		      System.out.printf("%.4f\n",ans);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}

}

