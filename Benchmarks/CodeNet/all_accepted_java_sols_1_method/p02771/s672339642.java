import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] c = {sc.next().charAt(0), sc.next().charAt(0), sc.next().charAt(0)};
		Arrays.sort(c);

		System.out.println((c[0] == c[1] && c[1] != c[2]) || (c[0] != c[1] && c[1] == c[2]) ? "Yes" : "No");
	}
}