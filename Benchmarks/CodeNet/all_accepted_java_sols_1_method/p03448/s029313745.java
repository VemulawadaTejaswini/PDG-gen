import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		
		sc.close();

		int count = 0;
		int var=0;
		for (int i=0; i<=a; i++) {
			for (int j=0; j<=b; j++) {
				for (int n=0; n<=c;n++) {
					if (x == 500*i + 100*j + 50*n) {
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}

}
