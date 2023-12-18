import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	static int n;
	static int[] values;
	
	public static void main(String[] args) {
		
		getInput();
		
		int maximumProfit = values[1] - values[0];
		int minimumValue = Math.min(values[0], values[1]);
		
		for(int i = 2; i < n; i++) {
			
			maximumProfit = Math.max(values[i] - minimumValue, maximumProfit);
			
			minimumValue = Math.min(minimumValue, values[i]);
			
		}
		
		System.out.println(maximumProfit);
		
	}
	
	public static void getInput() {
		n = input.nextInt();
		values = new int[n];
		
		for(int i = 0; i < n; i++) {
			values[i] = input.nextInt();
		}
	}

}
