import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}
		Arrays.sort(list);
		ArrayList<Integer> array = new ArrayList<Integer>();

		for (int i = list[0]; i <= list[N - 1]; i++) {
			int serve = 0;
			for (int p : list) {
				serve += (p - i) * (p - i);
			}
			array.add(serve);
		}

		Collections.sort(array);
		System.out.println(array.get(0));
	}
}