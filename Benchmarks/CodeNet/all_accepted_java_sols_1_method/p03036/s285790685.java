import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int D = sc.nextInt();
		int x = sc.nextInt();

		int[] total = new int[11];
		total[0] = x;
		for(int i = 1; i<=10; i++) {
			total[i] = r * total[i-1] - D;
			System.out.println(total[i]);
		}
	}

}
