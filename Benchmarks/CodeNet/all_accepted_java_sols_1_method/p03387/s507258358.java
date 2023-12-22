import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		int sum;
		sum = (a[2] - a[0]) + (a[2] - a[1]);
		if(sum % 2 == 0) System.out.println(sum / 2);
		else System.out.print(((sum + 1) / 2) + 1);
	}
}