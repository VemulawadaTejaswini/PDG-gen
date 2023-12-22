import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int[] array = new int[5];
		int result = 0;
		
		for (int i = A; i <= B; i++) {
			int n = i;
			int c = 0;
			while (n > 0) {
				array[c] = n % 10;
				n /= 10;
				c++;
			}
			
			if (array[0] == array[4] && array[1] == array[3]) {
				result++;
			}
			
		}

		out.println(result);
		out.flush();
	}
}