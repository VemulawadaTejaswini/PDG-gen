import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int p = Integer.parseInt(sc.next());
		sc.close();
		sc = null;
		System.out.println((a*3+p)/2);
	}
}