import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
			int n = s.nextInt();
			int d = s.nextInt();
			
			long[] x = new long[n];
			long[] y = new long[n];
			
			int counter = 0;
			
			for(int i = 0; i < n; i++){
				
				x[i] = s.nextInt();
				y[i] = s.nextInt();
				
			}
			
			for(int i = 0; i < n; i++){
				
				double temp = Math.sqrt(x[i] * x[i] + y[i] * y[i]);
				
				if(temp <= d){
					counter++;
				}
				
			}
			
			System.out.println(counter);
			
		}
	
}
