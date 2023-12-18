import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0){
				break;
			}
			
			int result = calcPattern(n);
			
			System.out.println(result);
		}
		

	}
	
	static int calcPattern(int n){
		int count = 0;
		
		for(int i = 1; i < n; i++){
			int sum = i;
			for(int j = i + 1 ; j < n ; j++){
				sum += j;
				
				if(sum == n){
					count++;
					break;
				}
			}
		}
		
		return count;
	}
}