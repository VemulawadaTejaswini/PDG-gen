import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int x[] = new int[10000];
		int i = 0;
		while (flag) {
			x[i] = sc.nextInt();
			if (x[i] == 0) {
				flag = false;
			}
			i++;
		}
		flag = true;
		i = 0;
		while (flag) {
			if (x[i] != 0) {
				System.out.println("Case " + (i + 1) + ": " + x[i]);
			} else if (x[i] == 0) {
				flag = false;
			}
			i++;
		}
	}
}
