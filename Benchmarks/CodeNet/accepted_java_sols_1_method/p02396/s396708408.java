import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int i = 0;
		int n[] = new int[100000];
		Scanner scan = new Scanner(System.in);
		while (true) {
			n[i] = scan.nextInt();
			if (n[i] == 0) {
				break;
			}
			i++;
		}
		for (int j = 0; j < i; j++) {
			System.out.println("Case " + (j+1) + ": " + n[j]);
		}
	}

}

