import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int kaisuT = (c%b == 0) ? c/b: c/b+1;
		int kaisuA = (a%d == 0) ? a/d: a/d+1;
		if (kaisuT <= kaisuA) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
