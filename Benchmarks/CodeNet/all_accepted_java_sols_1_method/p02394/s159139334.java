import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] ss = line.split(" ");
		int[] num = new int[ss.length];
		for (int i = 0; i < ss.length; i++) {
			num[i] = Integer.parseInt(ss[i]);
		}
		int w = num[0];
		int h = num[1];
		int x = num[2];
		int y = num[3];
		int r = num[4];
		if (x < r || y < r || x + r > w || y + r > h) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}