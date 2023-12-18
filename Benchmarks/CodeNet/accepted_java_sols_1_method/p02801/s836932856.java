import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String C = sc.next();
		sc.close();

      char c = C.charAt(0);
      char ans = (char) (c + 1);
      System.out.println(ans);
	}
}