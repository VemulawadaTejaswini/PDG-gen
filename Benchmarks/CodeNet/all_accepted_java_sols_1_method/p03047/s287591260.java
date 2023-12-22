import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		try(Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			int K = scanner.nextInt();
			
			int output = (N - K) + 1;
			
			System.out.println(output);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
