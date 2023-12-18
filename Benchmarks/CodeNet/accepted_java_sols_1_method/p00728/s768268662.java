import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int size = sc.nextInt();
			if (size == 0) break;
			int list[] = new int[size];
			for (int i = 0; i < size; ++i)
				list[i] = sc.nextInt();
			Arrays.sort(list);
			int sum = 0;
			for (int i = 0; i < size; ++i)
				if (i == 0 || i == size - 1) continue;
				else
					sum += list[i];
			System.out.println(sum / (size - 2));
		}
	}
}
