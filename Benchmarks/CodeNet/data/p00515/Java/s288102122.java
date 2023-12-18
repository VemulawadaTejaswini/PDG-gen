import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int total = 0;
		for (int i=0; i<5; i++) {
			int n = sc.nextInt();
			if (n < 40) {n = 40;}
			total += n;
		}
		out.println(total/5);
	}
}
