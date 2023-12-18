import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n[] = sc.next().split("");
		if (Integer.parseInt(n[0]) == Integer.parseInt(n[1]) &&
				Integer.parseInt(n[0]) == Integer.parseInt(n[2]) ||
				Integer.parseInt(n[1]) == Integer.parseInt(n[2]) &&
				Integer.parseInt(n[1]) == Integer.parseInt(n[3]))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}