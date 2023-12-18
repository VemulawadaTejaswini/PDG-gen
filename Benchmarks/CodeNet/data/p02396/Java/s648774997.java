import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int countDeta;
		int[] deta = new int[10000];
		for (countDeta = 0; true; countDeta++) {
			x = sc.nextInt();
			if (x == 0) {
				break;
			}
			deta[countDeta] = x;
		}
		for (int i = 1; i < countDeta; i++) {
			System.out.println("Case" + " " + i + ": " + deta[i]);
		}
		sc.close();
	}
}
