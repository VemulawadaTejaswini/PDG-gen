import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int K = scanner.nextInt();
		int from = scanner.nextInt();
		int to = scanner.nextInt();
		String result = "NG";
		
		scanner.close();
		
		for (int i = from; i <= to; i++) {
			
			if (i % K == 0) {
				result = "OK";
				break;
			} else {
			}

		}
		
		System.out.println(result);
	}

}
