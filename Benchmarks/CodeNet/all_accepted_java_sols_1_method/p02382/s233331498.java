import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			String[] x = br.readLine().split("\\s");
			String[] y = br.readLine().split("\\s");
			double d = 0;
			List<Double> mdList = new ArrayList<>();
			
			// マンハッタン距離（p = 1 のとき）
			for (int i = 0; i < n; i++) {
				d += Math.abs(Double.parseDouble(x[i]) -Double.parseDouble(y[i]));
			}
			mdList.add(d);
			d = 0;
			
			// ユークリッド距離（p = 2 のとき）
			for (int i = 0; i < n; i++) {
				d += Math.pow(Math.abs(Double.parseDouble(x[i]) -Double.parseDouble(y[i])), 2);
			}
			mdList.add(Math.sqrt(d));
			d = 0;
			
			// ユークリッド距離（p = 3 のとき）
			for (int i = 0; i < n; i++) {
				d += Math.pow(Math.abs(Double.parseDouble(x[i]) -Double.parseDouble(y[i])), 3);
			}
			mdList.add(Math.cbrt(d));
			d = 0;
			
			// チェビシェフ距離（p = ∞）
			for (int i = 0; i < n; i++) {
				d = Math.max(d, Math.abs(Double.parseDouble(x[i]) -Double.parseDouble(y[i])));
			}
			mdList.add(d);
			
			for (Double md: mdList) {
				System.out.printf("%.10f\n", md);
			}
			
		} catch (NumberFormatException | IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		
	}

}

