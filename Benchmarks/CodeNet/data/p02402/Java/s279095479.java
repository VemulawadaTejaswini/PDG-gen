import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in);){
			int n = sc.nextInt();
			
			long min = 1000001;
			long max = -1000001;
			long sum = 0;
			
			for(int i = 0; i < n; i++) {
				long a = sc.nextLong();
				
				if(a > max) {
					max = a;
				}
				if(a < min) {
					min = a;
				}
				sum += a;
			}
			
			System.out.println(min + " " + max + " " + sum);
		}
	}
}
