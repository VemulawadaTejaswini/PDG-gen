import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();

		int min =0;

		min = p+q;
		min = Math.min(min,q+r);
		min = Math.min(min,p+r);

		System.out.print(min);

	}

}
