import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var m = sc.nextInt();
		var a = new int[m];
		for(var i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		var sum = 0;
		for(var i = 0; i < m; i++) {
			sum += a[i];
		}

		System.out.println(sum <= n ? n - sum : -1);
	}
}