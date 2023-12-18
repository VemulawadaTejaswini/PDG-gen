import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { 
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			int[] arr = new int[10];
			int[] arr2 = new int[10];
			
			String[] split = input.readLine().split(" ");
			
			if (split.length < 4) {
				break;
			}
			
			for (int i = 0; i < 4; i++) {
				int a = Integer.parseInt(split[i]);
				arr[a]++;
				arr2[i] = a;
			}
			
			int hit = 0;
			int blow = 0;
			
			split = input.readLine().split(" ");
			
			for (int i = 0; i < 4; i++) {
				int b = Integer.parseInt(split[i]);
				
				if (arr2[i] == b) {
					hit++;
				} else if (arr[b] == 1) {
					blow++;
				}
				
			}
			
			System.out.println(hit + " " + blow);
		}
		
		input.close();
	}	
}