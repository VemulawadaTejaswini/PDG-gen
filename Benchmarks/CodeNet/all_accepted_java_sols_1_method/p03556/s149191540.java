import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int res = 0;
		for (int i=N; 0<i; i--) {
			int t = (int)Math.sqrt(i);
			if (Math.pow(t, 2) == i) {
				System.out.println(i);
				return;
			}
		}
	}
}
