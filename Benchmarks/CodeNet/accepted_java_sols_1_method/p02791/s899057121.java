import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		int min = sc.nextInt();
		int count = 1;
		for(int i = 0; i < n - 1; i++) {
			m = sc.nextInt();
			if(m < min) {
				min = m;
				count++;
			}
			if(m == 1) {
				break;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
