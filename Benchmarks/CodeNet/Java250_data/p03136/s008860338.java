import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	// Atcoder用のサンプルプログラム
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			//line = br.readLine();
			
			int N = Integer.parseInt(br.readLine());
			int sum = 0;
			int max = 0;
			String[] n = br.readLine().split(" ");
			for (int i = 0;i < N;i++) {
				int m = Integer.parseInt(n[i]);
				if (max < m) {
					max=m;
				}
				sum = sum+m;
			}
			if (max < sum-max) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
