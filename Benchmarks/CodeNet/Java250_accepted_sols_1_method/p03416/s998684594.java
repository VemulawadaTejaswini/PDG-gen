import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int count = 0;
		for(int a = 1; a < 10; a++) {
			for(int b  = 0; b < 10; b++) {
				for(int c = 0; c < 10; c++) {
					int temp = (10001*a)+(1010*b)+(100*c);
					if(temp >= l &&temp <= r) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
