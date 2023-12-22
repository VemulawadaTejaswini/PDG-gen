import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = 0;
		for(int i = 0; i < n; i++) {
			int h = sc.nextInt();
			if(h >= k) r++;
		}
		sc.close();
		System.out.println(r);
	}
}