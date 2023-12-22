import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> l = Arrays.asList(sc.nextLine().split(" "));
		int a = Integer.parseInt(l.get(0));
		int b = Integer.parseInt(l.get(1));
		int ans = a * b;
		System.out.print(ans);
	}
}