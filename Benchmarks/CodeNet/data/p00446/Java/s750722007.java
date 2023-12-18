import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


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
			
			boolean[] input = new boolean[2*n + 1];
			
			for(int i = 0; i < n; i++){
				input[Integer.parseInt(br.readLine())] = true;
			}
			
			ArrayList<Integer> taro = new ArrayList<Integer>();
			ArrayList<Integer> hanako = new ArrayList<Integer>();
			
			for(int i = 1 ; i <= 2*n ; i++){
				if(input[i]){
					taro.add(i);
				}
				else {
					hanako.add(i);
				}
			}
			
			//?????????????§?
			int place = 0;
			final int TARO = 0;
			final int HANAKO = 1;
			int player = TARO;
			
			int scoreT = 0;
			int scoreH = 0;
			
			while(true){
				int card;
				
				if(player == TARO){
					card = getMinimumCard(taro, place);
				}
				else {
					card = getMinimumCard(hanako, place);
				}
				
				if(card > 0){
					place = card;
					//System.out.println("Current "+place);
				}
				else {
					place = 0;
				}
				
//				int scoreT = 0;
//				int scoreH = 0;
				if(taro.size() == 0){
					scoreT = hanako.size();
					break;
				}
				else if(hanako.size() == 0){
					scoreH = taro.size();
					break;
				}
				
				if(player == TARO){
					player = HANAKO;
				}
				else {
					player = TARO;
				}
			}
			
			System.out.println(scoreT);
			System.out.println(scoreH);
		}
	}
	
	static int sum(ArrayList<Integer> list){
		int sum = 0;
		for(int i = 0; i < list.size() ; i++){
			sum += list.get(i);
		}
		
		return sum;
	}
	static int getMinimumCard(ArrayList<Integer> list, int place){
		for(int i = 0; i < list.size() ; i++){
			int tmp = list.get(i);
			if(tmp > place){
				list.remove(i);
				return tmp;
			}
		}
		
		return -1;
	}

}