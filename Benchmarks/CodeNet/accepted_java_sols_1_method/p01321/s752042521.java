import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			for(int i = 0; i < n; i++){
				final int sum = sc.nextInt()
								+ sc.nextInt()
								+ sc.nextInt()
								+ sc.nextInt()
								+ sc.nextInt();
				
				max = Math.max(max, sum);
				min = Math.min(min, sum);
			}
			
			System.out.println(max + " " + min);
		}
		
	}
}	