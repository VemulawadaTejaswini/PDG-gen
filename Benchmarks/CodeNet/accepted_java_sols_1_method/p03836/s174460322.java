import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sx = scan.nextInt();
		int sy = scan.nextInt();
		int tx = scan.nextInt();
		int ty = scan.nextInt();
		int x = tx - sx;
		int y = ty - sy;
		int x2 = (tx+1) - sx;
		int y2 = (ty+1) - sy;
		for (int i = 1; i <= x; i++) {
			System.out.print("R");
		}
		for (int i = 1; i <= y; i++) {
			System.out.print("U");
		}
		for (int i = 1; i <= x; i++) {
			System.out.print("L");
		}
		for (int i = 1; i <= y; i++) {
			System.out.print("D");
		}
		System.out.print("L");
		for (int i = 1; i <= y2; i++) {
			System.out.print("U");
		}
		for (int i = 1; i <= x2; i++) {
			System.out.print("R");
		}
		System.out.print("D");
		System.out.print("R");
		for (int i = 1; i <= y2; i++) {
			System.out.print("D");
		}
		for (int i = 1; i <= x2; i++) {
			System.out.print("L");
		}
		System.out.println("U");
	}
}
//RUULDDDRRUUULULLDDDR
//UURDDLLUUURRDRDDDLLU