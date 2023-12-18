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
			int k = Integer.parseInt(tmpArray[1]);
			int s = Integer.parseInt(tmpArray[2]);
			
			if(n == 0 && k == 0 && s == 0){
				break;
			}
			
			System.out.println(solve(n, k, s));
		}
	}
	
	static int solve(int n, int k, int s){
		if(k == 1){
			if(n >= s && s >= 1){
				return 1;
			}
			else {
				return 0;
			}
		}
		int result = 0;
		for(int i = n; i >= 2; i--){
			result += solve(i - 1, k - 1, s - i);
		}
		
		return result;
	}

}