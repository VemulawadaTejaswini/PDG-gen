import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int total = 0;
		for (int i=0; i<4; i++) total += sc.nextInt();
		out.println(total/60);
		out.println(total%60);
	}
}
