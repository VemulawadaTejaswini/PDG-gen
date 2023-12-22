import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder output = new StringBuilder();
		int count = 0;
		
		while(true) {
			int n = scan.nextInt();
			int x = scan.nextInt();
			
			if (n == 0 && x == 0) break;
			
			for (int i = 1; i <= n; i++) {
				for (int j = i+1; j <= n; j++) {
					for (int k = j+1; k <= n; k++) {
						if ((i + j + k) == x)
							count++;
					}
				}
			}
			output.append(count).append('\n');
			count = 0;
		}
		System.out.print(output);
		scan.close();
	}

}