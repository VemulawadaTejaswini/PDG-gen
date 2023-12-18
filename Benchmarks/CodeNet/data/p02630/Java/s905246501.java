import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		int[] number = new int[100000];
		Arrays.fill(number, 0);
		long sum = 0;
		for(int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(sc.next());
			list.add(tmp);
			number[tmp]++;
			sum += tmp;
		}
		int Q = Integer.parseInt(sc.next());
		for(int i = 0; i < Q; i++) {
			int tmpA = Integer.parseInt(sc.next());
			int tmpB = Integer.parseInt(sc.next());
			int changeCount = number[tmpA];
			sum = sum + (tmpB - tmpA) * changeCount;
			number[tmpA] = 0;
			number[tmpB] += changeCount;
			System.out.println(sum);
		}
		sc.close();

	}
}