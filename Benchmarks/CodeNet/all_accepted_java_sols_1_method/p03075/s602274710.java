import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] d = new int[6];

		for(int i = 0; i < d.length; i++) {
			d[i] = sc.nextInt();
		}

		System.out.println(d[4] - d[0] <= d[5] ? "Yay!" : ":(");
	}
}