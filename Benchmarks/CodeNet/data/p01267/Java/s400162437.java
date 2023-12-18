import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");
			
			int n = Integer.parseInt(tmpArray[0]);
			int a = Integer.parseInt(tmpArray[1]);
			int b = Integer.parseInt(tmpArray[2]);
			int c = Integer.parseInt(tmpArray[3]);
			int x = Integer.parseInt(tmpArray[4]);
			
			if(n == 0 && a == 0 && b == 0 && c == 0 && x == 0){
				break;
			}
			
			int[] randNum = new int[n];
			tmpArray = br.readLine().split(" ");
			for(int i = 0; i < n; i++){
				randNum[i] = Integer.parseInt(tmpArray[i]);
			}
			
			RandGenerator rg = new RandGenerator(x, a, b, c);
			
			int currentReel = 0;
			int turn = -1;
			
			if(x == randNum[0]){
				currentReel++;
				turn = 0;
			}
			
			for(int i = 1; i <= 10000 && currentReel < n ; i++){
				int tmpRand = rg.getRand();
				if(tmpRand == randNum[currentReel]){
					currentReel++;
					if(currentReel == n){
						turn = i;
						break;
					}
				}
			}
			
			System.out.println(turn);
		}
	}

}

class RandGenerator {
	private int x;
	private int a;
	private int b;
	private int c;
	
	public RandGenerator(int x, int a, int b, int c){
		this.x = x;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getRand(){
		x = (a*x + b)%c;
		return x;
	}
}