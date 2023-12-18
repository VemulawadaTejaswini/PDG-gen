import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		String dream = "dream";
		String dreamer = "dreamer";
		String erase = "erase";
		String eraser = "eraser";
		s = s.replace(eraser, "");
		s = s.replace(erase, "");
		s = s.replace(dreamer, "");
		s = s.replace(dream, "");
		if (s.equals("")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
