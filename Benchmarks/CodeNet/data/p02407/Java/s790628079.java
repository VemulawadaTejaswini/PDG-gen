import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.nextLine();
		String[] line = in.nextLine().split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = 0, max = line.length ; i < max; i++) {
			sb.append(" ").append(line[max - i]);
		}
		System.out.println(sb.delete(0, 1).toString());
	}
}