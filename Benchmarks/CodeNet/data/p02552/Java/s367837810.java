import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int x = in.nextInt();
		if (x == 0)
			System.out.println(1);
		else
			System.out.println(0);
	}

}
