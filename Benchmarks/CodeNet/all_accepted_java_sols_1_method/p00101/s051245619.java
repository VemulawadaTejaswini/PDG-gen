import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		Integer n = new Integer(sc.nextLine());
		for(int i = 0; i < n; i++) {
			System.out.println(sc.nextLine().replaceAll("Hoshino", "Hoshina"));
		}
	}
}