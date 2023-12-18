import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum, max_sum;
		int num, c_num;
		int [] number = new int[100000];
		
		num = scanner.nextInt();
		c_num = scanner.nextInt();
		while(num != 0 || c_num != 0) {
			sum = max_sum = 0;
			
			for(int i = 0; i < num; i++) {
				number[i] = scanner.nextInt();
			}
			
			for(int i = 0; i < c_num; i++) {
				sum += number[i];
			}
			max_sum = sum;
			
			for(int i = 1; i < num - c_num + 1; i++) {
				sum -= number[i - 1];
				sum += number[i + c_num - 1];
				if (sum > max_sum ) {
					max_sum = sum;
				}
			}

			System.out.println(max_sum);
			
			num = scanner.nextInt();
			c_num = scanner.nextInt();
		}
	}
}