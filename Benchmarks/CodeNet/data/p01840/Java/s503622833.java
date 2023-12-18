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
		
		String[] tmpArray = br.readLine().split(" ");
		
		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);
		int t = Integer.parseInt(tmpArray[2]);
		
		
		String delivery = br.readLine();
		
		System.out.println(solve(delivery, n, m, t));
		
	}
	
	static int solve(String delivery, int n, int m, int t){
		String[] tmpArray = delivery.split(" ");
		
		int delTime[] = new int[n];
		int outsideTime = 0;
		for(int i = 0; i < n; i++){
			delTime[i] = Integer.parseInt(tmpArray[i]);
		}
		
		for(int i = 0; i < n; i++){
			if(i == 0){
				outsideTime += m;
			}
			else if(delTime[i] - delTime[i - 1] > m*2){
				outsideTime += m*2;
			}
			else {
				outsideTime += delTime[i] - delTime[i - 1];
			}
//			System.out.println("i = "+i+" outsideTime = "+outsideTime);
		}
		outsideTime += Math.min(m, t-delTime[n - 1]);
		
		return t - outsideTime;
	}

}