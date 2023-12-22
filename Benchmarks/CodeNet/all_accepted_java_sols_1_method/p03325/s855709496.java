import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int ans = 0;
		for (int i=0; i<n; i++){
			int a = scanner.nextInt();
			while (a%2==0){
				ans++;
				a = a/2;
			}
		}
		System.out.println(ans);
	}
}