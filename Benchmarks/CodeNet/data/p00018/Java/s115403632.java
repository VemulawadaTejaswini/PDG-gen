import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int[] n = new int[5];
			for (int i = 0 ; i < 5 ; i++) n[i] = sc.nextInt();
			Arrays.sort(n);
			for (int i = 4 ; i > 0 ; i--) System.out.print(n[i]+" ");
			System.out.print(n[0]+"\n");
		}

	}
}