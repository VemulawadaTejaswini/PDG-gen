import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int gx = sc.nextInt();
		int gy = sc.nextInt();
		int dx = Math.abs(sx - gx);
		int dy = Math.abs(sy - gy);
		for(int i = 0 ; i < dx ; i++) {
			System.out.print("R");
		}
		for(int i = 0 ; i < dy ; i++) {
			System.out.print("U");
		}
		for(int i = 0 ; i < dx ; i++) {
			System.out.print("L");
		}
		for(int i = 0 ; i < dy ; i++) {
			System.out.print("D");
		}
		System.out.print("D");
		for(int i = 0 ; i < dx + 1 ; i++) {
			System.out.print("R");
		}
		for(int i = 0 ; i < dy + 1 ; i++) {
			System.out.print("U");
		}
		System.out.print("LU");
		for(int i = 0 ; i < dx + 1 ; i++) {
			System.out.print("L");
		}
		for(int i = 0 ; i < dy + 1 ; i++) {
			System.out.print("D");
		}
		System.out.println("R");
	}
}
