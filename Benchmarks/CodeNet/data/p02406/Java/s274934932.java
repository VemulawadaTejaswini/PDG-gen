import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		for (int i = 1; i <= x; i++){  
			if (i % 3 == 0)  
				System.out.print(i);  
		}
	}
}