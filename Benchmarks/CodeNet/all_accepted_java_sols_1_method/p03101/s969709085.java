import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int hh = Integer.parseInt(sc.next());
		int ww = Integer.parseInt(sc.next());

		int cells = h * w;
		System.out.println(cells - hh*w -  ww*h + hh * ww);

	}
}
