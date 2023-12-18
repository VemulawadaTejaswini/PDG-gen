import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int h, w, x, y;
		Scanner sca = new Scanner(System.in);
		
		h = sca.nextInt();
		w = sca.nextInt();
		x = sca.nextInt();
		y = sca.nextInt();
		
		System.out.println((h-x)*(w-y));
	}
}
