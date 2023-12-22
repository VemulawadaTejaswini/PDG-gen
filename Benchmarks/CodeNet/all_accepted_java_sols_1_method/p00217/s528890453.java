import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int max = Integer.MIN_VALUE;
			int number = -1;
			for(int i = 0; i < n; i++){
				final int p = sc.nextInt();
				final int sum = sc.nextInt() + sc.nextInt();

				if(max < sum){
					max = sum;
					number = p;
				}
			}
			
			System.out.println(number + " " + max);
			
		}
	}

}