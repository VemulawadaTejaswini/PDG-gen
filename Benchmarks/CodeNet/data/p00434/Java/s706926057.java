import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] f = new int[31];
		for (int i = 0; i < 28; i++)
			f[s.nextInt()] = 1;
		for (int i = 1; i <= 30; i++)
			if (f[i] == 0)
				System.out.println(i);
	}
}