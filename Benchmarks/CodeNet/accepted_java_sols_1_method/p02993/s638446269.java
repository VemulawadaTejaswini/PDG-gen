import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        String w = sc.next();
        String ans = "Good";

        if (w.substring(0, 1).equals(w.substring(1, 2))
            || w.substring(1, 2).equals(w.substring(2, 3))
            || w.substring(2, 3).equals(w.substring(3, 4))) {
            ans = "Bad";
        }

        System.out.println(ans);

		sc.close();
	}
}
