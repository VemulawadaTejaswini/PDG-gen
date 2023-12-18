import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0){
				break;
			}
			
			int change = 1000 - n;
			
			int coin = 0;
			
			int[] coins = {500,100,50,10,5,1};
			for(int i = 0; i < coins.length ; i++){
				coin += change / coins[i];
				change %= coins[i];
			}
			
			System.out.println(coin);
		}
	}

}