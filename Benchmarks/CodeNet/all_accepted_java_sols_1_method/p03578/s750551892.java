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
		String input = br.readLine();
		
		int n = Integer.parseInt(input);
		
		String[] tmpArray = br.readLine().split(" ");
		int diff[] = new int[n];
		
		for(int i = 0; i < n; i++){
			diff[i] = Integer.parseInt(tmpArray[i]);
		}
		
		Arrays.sort(diff);
		
		int m = Integer.parseInt(br.readLine());
		
		tmpArray = br.readLine().split(" ");
		int test[] = new int[m];
		
		for(int i = 0; i < m; i++){
			test[i] = Integer.parseInt(tmpArray[i]);
		}
		
		Arrays.sort(test);
		
		int currentDindex = 0;
		for(int i = 0; i < m; i++){
			boolean hit = false;
			for(int j = currentDindex ; j < n; j++){
				if(diff[j] == test[i]){
					currentDindex = j + 1;
					hit = true;
					break;
				}
			}
			
			if(!hit){
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println("YES");
	}

}
