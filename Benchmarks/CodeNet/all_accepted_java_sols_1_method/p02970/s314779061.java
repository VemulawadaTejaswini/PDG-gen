import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n = sc.nextDouble();
		double d = sc.nextDouble();

		int ans = (int)(Math.ceil(n/(2*d+1)));
		System.out.println(ans);

	}
}
