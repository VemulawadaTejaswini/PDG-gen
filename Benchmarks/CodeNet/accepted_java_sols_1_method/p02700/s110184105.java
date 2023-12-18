import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var a = sc.nextInt();
		var b = sc.nextInt();
		var c = sc.nextInt();
		var d = sc.nextInt();
		sc.close();

		var tc = Math.ceil((double)c / b);
		var ac = Math.ceil((double)a / d);

		System.out.println(tc <= ac ? "Yes" : "No");
	}
}