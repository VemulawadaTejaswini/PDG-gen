import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int n = in.nextInt();
			if(n == 0) break;
			int sum = 0;
			for(int i = 5; i <= n; i *= 5) 
				sum+=n/i;
			System.out.println(sum);
		}
	}
}