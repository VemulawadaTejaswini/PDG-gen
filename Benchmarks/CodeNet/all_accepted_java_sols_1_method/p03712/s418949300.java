import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[]s = new String[H + 2];
		for(int i = 0; i < H + 2; i++) {
			s[i] = "";
		}
		for(int i = 0; i < W + 2; i++) {
			s[0] += "#";
			s[H + 1] += "#";
		}
		for(int i = 0; i < H; i++) {
			String t = sc.next();
			t = "#" + t + "#";
			s[i + 1] = t;
		}
		sc.close();
		for(String k : s) {
			System.out.println(k);
		}
	}
}