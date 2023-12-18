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
		
		int n = Integer.parseInt(br.readLine());
		
		int input[][] = new int[n][3];
		
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			for(int j = 0; j < 3; j++){
				input[i][j] = Integer.parseInt(tmpArray[j]);
			}
		}
		
		boolean reachable = true;
		//到達可能チェック
		int currentX = 0;
		int currentY = 0;
		int time = 0;
		for(int i = 0; i < n; i++){
			int dist = Math.abs(currentX - input[i][1]) + Math.abs(currentY - input[i][2]);
			int timeInterval = input[i][0] - time;
			
			if(!(dist <= timeInterval && Math.abs(dist - timeInterval) % 2 == 0)){
				reachable = false;
				break;
			}
		}
		
		if(reachable){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
