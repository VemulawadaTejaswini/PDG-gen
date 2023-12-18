
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.print(" ");
		for(i = 3; i < n && n <= 10000; i++){
			if(i % 3 == 0)
				System.out.print(i + " ");
			else if(i % 10 == 3)
				System.out.print(i + " ");
			else if(i % 100 == 3)
				System.out.print(i + " ");
			else if(i % 1000 == 3)
				System.out.print(i + " ");
		}
		System.out.print(n);
	}
}