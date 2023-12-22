
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String h1 = scanner.nextLine();
		int a = Integer.parseInt(h1);
		//System.out.println(a);

		String h2 = scanner.nextLine();
		String[] x = h2.split(" ");
		//Arrays.sort(x);


		for (int y = a - 1; y >= 0; y--) {
			if(y!=0)
			System.out.print(x[y] + " ");
			else
			System.out.println(x[y]);
		}
	}
}