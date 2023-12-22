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
			String N= br.readLine();

			int temp = Integer.parseInt(N);
			List memory = new ArrayList();
			for (int i = 0;i < 1000000;i++) {
				if (memory.contains(temp)) {
					System.out.println(i+1);
					break;
				} else {
					memory.add(temp);
					//System.out.println("temp:" + temp);
				}
              
				if (temp % 2 == 1) {
				    temp=3*temp+1;	
				} else {
					temp=temp/2;
				}
				

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
