import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		long ans=0;
		for (int i = 0;; i++) {
			long square = i*i;
			if (square>n) {
				break;
			}else{
				ans=square;
			}
		}
		
		System.out.println(ans);
		scanner.close();

	}

}