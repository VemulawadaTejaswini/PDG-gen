import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] s  = line.split(" ");
		int height =Integer.parseInt(s[0]);
		int width=Integer.parseInt(s[1]);
		System.out.print(menseki(height,width));
		System.out.print(" ");
		System.out.println(shuu(height,width));
	}

	private static int menseki(int height, int width) {
		return height * width;
	}

	private static int shuu(int height, int width) {
		return (height + width) * 2;
	}
}