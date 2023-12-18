import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] chars = new char[h][w];
		int count = 0;
		for(int i = 0; i < h; i++) {
			chars[i] = sc.next().toCharArray();
		}
		for(char[] a : chars) {
			for(char c : a) {
				if(c=='#') {
					count++;
				}
			}
		}
		System.out.println(h+w-1==count ? "Possible" : "Impossible");
	}
}