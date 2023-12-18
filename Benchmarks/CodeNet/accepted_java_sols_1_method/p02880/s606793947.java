import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int a = 1;a<10;a++) {
			for(int b = 1;b<10;b++) {
				if(N==a*b) {
					System.out.println("Yes");
					System.exit(0);
				}
			}
		}
		System.out.println("No");

	}

}
