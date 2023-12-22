import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int n = in.nextInt();
		int[] lines = new int[size];
		int a, b;
		for (int i = 0; i < lines.length; i++) {
			lines[i] = i + 1;
		}
		for (int i = 0; i < n; i++) {
			String input = in.next();
			a = Integer.parseInt(input.split(",")[0]);
			b = Integer.parseInt(input.split(",")[1]);
			lines = swap(a, b, lines);
		}
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
		}
		in.close();
	}

	public static int[] swap(int a, int b, int[] lines) {
		int temp = lines[a - 1];
		lines[a - 1] = lines[b - 1];
		lines[b - 1] = temp;
		return lines;
	}
}