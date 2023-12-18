import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			String[] line = sc.next().split("");
			System.out.print(line[i]);
		}
	}
}