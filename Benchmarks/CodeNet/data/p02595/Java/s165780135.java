import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		try (Scanner scanner = new Scanner(System.in)) {

			int num = scanner.nextInt();
			
			int distance = scanner.nextInt();
			distance = distance * distance;
			
			
			int cnt = 0;
			
			for(int i = 0; i < num; i++) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				
				if (x * x + y * y <= distance) {
					cnt++;
				}
			}

			System.out.println(cnt);
		}
	}
}