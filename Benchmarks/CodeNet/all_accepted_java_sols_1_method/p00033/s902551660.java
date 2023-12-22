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
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			
			int[] balls = new int[10];
			for(int j = 0; j < 10; j++){
				balls[j] = Integer.parseInt(tmpArray[j]);
			}
			
			//boolean[] isLeft = new boolean[10];
			int currentLeft = balls[0];
			//isLeft[0] = true;
			int currentRight = -1;
			boolean possible = true;
			for(int j = 1; j < 10 ; j++){
				if(balls[j] > currentLeft){
					currentLeft = balls[j];
				}
				else if(currentRight == -1 || currentRight < balls[j]){
					currentRight = balls[j];
				}
				else {
					possible = false;
				}
			}
			if(possible){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}