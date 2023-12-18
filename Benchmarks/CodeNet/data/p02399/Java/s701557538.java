import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int kaisu = 2;
		int[] num = new int[kaisu];

		for(int i = 0; i < kaisu; i++) {
			num[i] = scan.nextInt();
		}

		int d = num[0] / num[1];
		int r = num[0] % num[1];
		double f = num[0] / (double)num[1];
		System.out.println(d + " " + r + " " + f);

　}
}