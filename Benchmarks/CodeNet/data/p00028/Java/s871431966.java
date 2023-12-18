import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] h = new int[101];
		while (sc.hasNext()) {
			h[Integer.parseInt(sc.next())]++;
		}
		long max = 0;
		for (int i = 0 ; i < 101 ; i++) max = Math.max(max, h[i]);
		for (int i = 0 ; i < 101 ; i++) if (max == h[i]) System.out.println(i);
    }
}