import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int R = s.replace("B", "").length();
		int B = N - R;
		if (R > B)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}