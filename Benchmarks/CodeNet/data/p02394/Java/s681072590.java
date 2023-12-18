import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int w = number.nextInt();
		int h = number.nextInt();
		int x = number.nextInt();
		int y = number.nextInt();
		int r = number.nextInt();
		boolean result = true;
		if(w < x + r || 0 > x - r) result = false;
		if(h < y + r || 0 > y - r) result = false;
		if(result == true) System.out.println("Yes");
		else System.out.println("No");
	}
}
