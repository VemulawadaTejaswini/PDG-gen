import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = 3;
		for (int i = 0; i < 3; i++) {
			sb.append(sc.next().toCharArray()[0]);
		}
		System.out.println(sb);
		sc.close();
	}
}
