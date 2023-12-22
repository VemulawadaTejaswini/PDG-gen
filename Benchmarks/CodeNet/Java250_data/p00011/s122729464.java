import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;

public class Main{
	
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		s.useDelimiter("\\s*,\\s*|\\s");
		
		int w = s.nextInt();
		int n = s.nextInt();
				
		int[] x = new int[w];
		
		for(int i = 0; i < w; i++){
			x[i] = i+1;
		}
		
		for(int i = 0; i < n; i++){
			
			int a = s.nextInt();
			int b = s.nextInt();
			
			int tmp = x[a-1];
			x[a-1] = x[b-1];
			x[b-1] = tmp;
			
		}
		
		for(int i = 0; i < w; i++){
			System.out.println(x[i]);
		}
		
	}
	
}
