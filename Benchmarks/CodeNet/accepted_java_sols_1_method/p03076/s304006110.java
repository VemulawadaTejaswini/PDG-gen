import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dish = new int[5];
		
		int maxMargin = 0;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			dish[i] = sc.nextInt();
			
			int margin = (10 - dish[i] % 10) % 10;
			
			sum += dish[i] + margin;
			maxMargin = Math.max(maxMargin, margin);
		}
		
		sum -= maxMargin;
		System.out.println(sum);
		
		sc.close();
	}
	
}


