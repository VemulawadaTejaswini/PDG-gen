import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		try (Scanner scanner = new Scanner(System.in)) {

			long num = scanner.nextInt();
			
			long distance = scanner.nextInt();
			distance = distance * distance;
			
			
			long cnt = 0;
			
			for(long i = 0; i < num; i++) {
				long x = scanner.nextInt();
				long y = scanner.nextInt();
				
				if (x * x + y * y <= distance) {
					cnt++;
				}
			}

			System.out.println(cnt);
		}
	}
}