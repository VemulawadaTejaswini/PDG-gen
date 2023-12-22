import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		int max = 0;

		for (int i = 0; i < Math.ceil(Math.sqrt(x)); i++) {
			for (int j = 0; j<6; j++) {
				if (Math.pow(i, j) > max && Math.pow(i, j)<=x)
					max = (int) Math.pow(i, j);
			}
		}
		System.out.println(max);
	}
}
