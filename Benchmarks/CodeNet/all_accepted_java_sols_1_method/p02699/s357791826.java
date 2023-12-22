import java.util.*;

public class Main {
	static final int r = 1000000000 + 7;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt(), w = sc.nextInt();
		String an[] = {"unsafe", "safe"};
		int a = 1;
		if(w >= s)a = 0;
		sc.close();
		System.out.println(an[a]);
	}
}
