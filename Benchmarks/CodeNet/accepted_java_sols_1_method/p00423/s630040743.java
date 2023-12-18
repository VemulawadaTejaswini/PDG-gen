import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = -1;
		
		while((n=scanner.nextInt()) != 0) {
			int scoreOfA=0, scoreOfB=0;
			for(int i=0; i<n; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				
				if(a>b) scoreOfA += (a+b);
				else if(b>a) scoreOfB += (a+b);
				else {
					scoreOfA += a;
					scoreOfB += b;
				}
			}
			System.out.printf("%d %d\n", scoreOfA, scoreOfB);
		}
		
		scanner.close();

	}

}