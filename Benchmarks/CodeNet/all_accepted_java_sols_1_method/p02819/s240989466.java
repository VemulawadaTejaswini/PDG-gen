import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int x = sc.nextInt();
			
			int max = 100003;
			
			int[] nums = new int[max + 1];
			
			int current = 2;
			
			while(current <= max ) {
				
				if ( nums[current] == 1 ) {
					current++;
					continue;
				}
				
				int mult = current * 2;
				while( mult <= max) {
					nums[mult] = 1; // not prime number
					mult += current;
				}
				
				current++;
			}
			
			while(x <= max) {
				if ( nums[x] == 1 ) {
					x++;
				}
				else {
					System.out.println(x);
					return;
				}
			}
		}
	}
}