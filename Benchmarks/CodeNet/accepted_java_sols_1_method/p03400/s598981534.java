
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n  = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int chocolate = 0;

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			for(int j = 0; j <=d; j++) {
				int temp  = a*j+1;
				if(temp <= d) {
					chocolate++;
				}
				else {
					break;
				}
			}
		}
		System.out.println(chocolate+x);
	}

}