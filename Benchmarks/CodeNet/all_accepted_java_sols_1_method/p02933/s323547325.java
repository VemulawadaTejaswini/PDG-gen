import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a = in.nextInt();
		String s = in.next();
		if (a >= 3200)
			System.out.println(s);
		else
			System.out.println("red");
	}
}