import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] r = new int[n];
		
		for(int i = 0; i < n; i++){
			r[i] = Integer.parseInt(br.readLine());
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++){
			max = Math.max(max, r[i] - min);
			min = Math.min(min, r[i]);
		}
		
		System.out.println(max);
	}
}