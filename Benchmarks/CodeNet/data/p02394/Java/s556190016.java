import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = Integer.parseInt(in.next());
		int h = Integer.parseInt(in.next());
		int x = Integer.parseInt(in.next());
		int y = Integer.parseInt(in.next());
		int r = Integer.parseInt(in.next());
		int count = 0;
		if (x < r || w - x < r) {
			count++;
		} else if (y < r || h - y < r) {
			count++;
		}
		
		System.out.println(count == 1 ? "No" : "Yes");
	}
}	
