
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//??\?????¨
		int n = Integer.parseInt(br.readLine());
		
		int[] price = new int[n];
		for(int i = 0; i < n; i++){
			price[i] = Integer.parseInt(br.readLine());
		}
		
		int maxProfit = -1;
		for(int i = 0; i < n - 1; i++){
			int tmpHigh = 0;
			for(int j = i + 1; j < n; j++){
				if(price[j] > tmpHigh){
					tmpHigh = price[j];
				}
			}
			
			if(tmpHigh - price[i] > maxProfit){
				maxProfit = tmpHigh - price[i];
			}
		}
		
		if(maxProfit > 0){
			System.out.println(maxProfit);
		}
		else {
			System.out.println(-1);
		}
	}

}