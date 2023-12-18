import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int number = −1000000;
		int max = −1000000;
		int min = −1000000;
		int sum = −1000000;
		
		for(int i=0;  i<n; i++) {
			number = sc.nextInt();
			
			sum = sum + number;
			
			if (number > max) max = number;
			if (number < min) min = number;
		}		
		
		System.out.println(min);
		System.out.println(max);
		System.out.println(sum);
	}
}
