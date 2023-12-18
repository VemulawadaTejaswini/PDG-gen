import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int sum = 0;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < n; i++){
				final int t = sc.nextInt();
				sum += t;
				max = Math.max(max, t);
				min = Math.min(min, t);
			}
			
			sum -= max;
			sum -= min;
			sum /= n - 2;
			
			System.out.println(sum);
		}
		
	}

}