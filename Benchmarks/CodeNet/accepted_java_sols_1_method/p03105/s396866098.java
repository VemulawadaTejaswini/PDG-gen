import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		if(Math.floor((double)(B/A))>C) {
			System.out.println(C);
		}else {
			System.out.println((int)(Math.floor((double)(B/A))));
		}

	}
}
