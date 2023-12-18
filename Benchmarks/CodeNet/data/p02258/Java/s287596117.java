import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) - 1;
		int[] r = new int[n];
		
		for(int i = 0; i < n; i++){
			r[i] = Integer.parseInt(br.readLine());
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				max = Math.max(max, r[j] - r[i]);
			}
		}
		
		System.out.println(max);
	}
}