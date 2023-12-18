import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean[] v = new boolean[31];
		for (int i = 0; i < 28; ++i) {
			v[sc.nextInt()] = true;
		}
		for (int i = 1; i <= 30; ++i) {
			if (!v[i]) System.out.println(i);
		}
	}

}