
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//String str = sc.nextLine();
		//String sl[] = str.split(" ");
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		int x = Integer.parseInt(sc.nextLine());

		int s = 0;
		
		for(int i = 0; i <= a; i++)
			for(int j = 0; j <= b; j++)
				for(int k = 0; k <= c; k++)
					s += (500 * i + 100 * j + 50 * k == x ? 1 : 0);
		System.out.println(s);
	}
}