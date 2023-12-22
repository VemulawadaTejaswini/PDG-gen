public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int i = 1;
		do {
			int x = sc.nextInt();
			if (x == 0) { break; }
			sb.append("Case ").append(i).append(": ").append(x).append("\n");
			i++;
		} while (true);
		System.out.print(sb.toString());
	}
}