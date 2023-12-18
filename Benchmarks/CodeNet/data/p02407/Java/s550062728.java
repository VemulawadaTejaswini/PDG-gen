import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 100, i, j, temp = 0;
		int a[] = new int[1000];
		Scanner stdin = new Scanner(System.in);
		n = stdin.nextInt();
		for (i = 0; i < n; i++) {
			a[i] = stdin.nextInt();
		}
		j = i - 1;
		i = 0;
		while (i < j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		for (i = 0; i < n; i++) {
			System.out.print(a[i] + "  ");

		}
	}
}