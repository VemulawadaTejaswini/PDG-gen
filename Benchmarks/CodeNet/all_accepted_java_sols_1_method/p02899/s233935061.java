import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer> students = new ArrayList<>();
		for(int i = 0; i < num; i++) {
			students.add(0);
		}

		for(int i = 1; i <= num; i++) {
			students.set(sc.nextInt() - 1, i);
		}

		for (Integer s : students) {
			System.out.print(s + " ");
		}

	}
}