import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int n = scan.nextInt();
		int[] amida;
		amida = new int[w];
		for (int i = 0; i < amida.length; i ++) amida[i] = i + 1;
		for (int i = 0; i < n; i ++) {
			String line = scan.next();
			String[] ab = line.split(",", 0);
			int a = Integer.parseInt(ab[0]) - 1;
			int b = Integer.parseInt(ab[1]) - 1;
			int swap = amida[a];
			amida[a] = amida[b];
			amida[b] = swap;
		}
		for (int i = 0; i < w; i ++) System.out.printf("%d\n", amida[i]);
	}
}