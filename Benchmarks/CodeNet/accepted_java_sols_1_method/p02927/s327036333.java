
import java.util.Scanner;

public class Main {

	public static final long MOD = 1_000_000_007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		int count = 0;
		for (int i=4;i<=m;i++) {
			for (int j=22;j<=d;j++) {
				if (j%10 >= 2 && (j/10) * (j%10) == i) {
					count++;
				}
			}
		}
		System.out.println(count);


	}





}