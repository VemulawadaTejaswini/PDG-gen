import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt() ;
		int d;
		int sum = 0;

		for(int i = 0; i < a-1; i++) {
			d = sc.nextInt();
			if((d - c) < b) {
				sum += (d-c);

			} else {
				sum += b;
			}
			c = d;
		}
		sum += b;
		System.out.println(sum);
	}

}
