import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] yen = new int[4];
		for (int i = 0; i < 4; i++) {
			yen[i] = sc.nextInt(); // 0:電車通常 1:電車乗り放題 2:バス通常 3:バス乗り放題
		}
		sc.close();
		System.out.println(Math.min(yen[0], yen[1]) + Math.min(yen[2], yen[3]));
	}
}
