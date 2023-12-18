import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static double max_n;
	private static double min_n;
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		max_n = Double.MIN_NORMAL;
		min_n = Double.MAX_VALUE;
		for(int i=0;i<5;i++){
			double n = Double.parseDouble(br.readLine());
			if(max_n < n){
				max_n = n;
			}
			else if(min_n > n){
				min_n = n;
			}
		}
		
		System.out.println(max_n-min_n);
		

	}
}