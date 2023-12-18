import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int a = sc.nextInt();
	static int b = sc.nextInt();
	static int c = sc.nextInt();
	static int d = sc.nextInt();
	static int e = sc.nextInt();
	static int f = sc.nextInt();
	public static void main(String[] args) {
		selectSubject();
	}

	private static void selectSubject() {
		ArrayList<Integer> sc = new ArrayList<Integer>();
		ArrayList<Integer> ss = new ArrayList<Integer>();

		sc.add(a); sc.add(b); sc.add(c); sc.add(d);
		ss.add(e); ss.add(f);

		Collections.sort(sc);
		Collections.sort(ss);

		System.out.println(sc.get(1) + sc.get(2) + sc.get(3) + ss.get(1));
	}

}

