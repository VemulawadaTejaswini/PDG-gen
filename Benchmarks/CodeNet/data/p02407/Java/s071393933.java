import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.nextLine();
		String[] line = in.nextLine().split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = line.length -1; i >= 0; i--) {
			sb.append(" ").append(line[i]);
		}
		System.out.println(sb.delete(0, 1).toString());
	}
}