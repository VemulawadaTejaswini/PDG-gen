
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("aaas");
		if (sc.hasNext()) {
			String[] a = sc.nextLine().split(" ");

			Arrays.sort(a);
			int min = 0, max = 0, sum = 0;
			min = Integer.parseInt(a[0]);
			max = Integer.parseInt(a[a.length - 1]);

			for (String aa : a) {
				sum += Integer.parseInt(aa);
			}
			System.out.println(min + " " + max + " " + sum);
		}
	}
}