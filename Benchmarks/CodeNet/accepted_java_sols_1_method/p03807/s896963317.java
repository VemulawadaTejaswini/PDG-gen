import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int kiC = 0;
		for(int i = 0; i < n; i++) {
			long a = sc.nextLong();
			if(a%2==1) {
				kiC++;
			}
		}
		System.out.println(kiC%2==0 ? "YES" : "NO");
	}
}