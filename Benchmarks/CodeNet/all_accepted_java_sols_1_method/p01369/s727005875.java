import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int hand[] = new int[256];
		final int LEFT = 0;
		final int RIGHT = 1;
		Arrays.fill(hand, RIGHT);
		hand['q'] = LEFT;
		hand['w'] = LEFT;
		hand['e'] = LEFT;
		hand['r'] = LEFT;
		hand['t'] = LEFT;
		hand['a'] = LEFT;
		hand['s'] = LEFT;
		hand['d'] = LEFT;
		hand['f'] = LEFT;
		hand['g'] = LEFT;
		hand['z'] = LEFT;
		hand['x'] = LEFT;
		hand['c'] = LEFT;
		hand['v'] = LEFT;
		hand['b'] = LEFT;
		
		while(true){
			String input = br.readLine();
			
			if(input.equals("#")){
				break;
			}
			
			int currentHand = hand[input.charAt(0)];
			
			int change = 0;
			for(int i = 1; i < input.length() ; i++){
				if(currentHand != hand[input.charAt(i)]){
					change++;
					currentHand = hand[input.charAt(i)];
				}
			}
			
			System.out.println(change);
		}
	}

}