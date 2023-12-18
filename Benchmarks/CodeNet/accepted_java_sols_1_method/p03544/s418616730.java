import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		long l[] = new long[h + 1];
		l[0] = 2;
		l[1] = 1;
		for (int i = 2; i <= h; i++)
			l[i] = l[i - 1] + l[i - 2];
		System.out.println(l[h]);
	}
}