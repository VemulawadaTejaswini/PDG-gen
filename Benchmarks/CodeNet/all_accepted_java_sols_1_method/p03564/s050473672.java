import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 1;
		for(int i = 0; i < n; i++) {
			if(count > k) {
				count += k;
			} else {
				count *= 2;
			}
		}
		System.out.println(count);
	}
}