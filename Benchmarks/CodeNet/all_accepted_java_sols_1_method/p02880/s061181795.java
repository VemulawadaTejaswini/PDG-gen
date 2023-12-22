import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean b = false;
		for(int i = 1 ; i < 10 ; i++) {
			for(int j = i ; j < 10 ; j++) {
				if(i * j == n)
					b = true;
			}
		}

		sc.close();
		System.out.println(b ? "Yes" : "No");

	}
}

