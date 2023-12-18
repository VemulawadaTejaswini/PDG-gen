import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var s = sc.next();
		sc.close();

		if (s.equals(s.toUpperCase())){
			s = "A";
		} else {
			s = "a";
		}

		System.out.println(s);
	}
}
