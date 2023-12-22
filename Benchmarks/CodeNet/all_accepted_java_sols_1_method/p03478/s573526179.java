import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum, num;
		int total = 0;
		
		for(int i = 1; i <= N; i++) {
			sum = 0;
			num = i;
			while(num > 0) {
				sum += num % 10;
				num /= 10;
			}
			if(A <= sum && sum <= B) {
				total += i;
			}
		}
		
		System.out.println(total);
	}

}
