import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int A, B, x;
		A = reader.nextInt();
		B = reader.nextInt();
		x = A + B;
		if((x & 1) == 0)
			System.out.println(x/2);
		else
			System.out.println("IMPOSSIBLE");
	}

}
