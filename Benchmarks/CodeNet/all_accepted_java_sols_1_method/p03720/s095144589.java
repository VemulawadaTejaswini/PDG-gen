import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		ArrayList<Integer> listA = new ArrayList<>();
		ArrayList<Integer> listB = new ArrayList<>();
		int[] city = new int[N];
		for(int i = 0; i < M; i++) {
			listA.add(Integer.parseInt(sc.next()) - 1);
			listB.add(Integer.parseInt(sc.next()) - 1);
		}
		sc.close();

		Arrays.fill(city, 0);
		for(int i = 0; i < M; i++) {
			city[listA.get(i)]++;
			city[listB.get(i)]++;
		}
		for(int i = 0; i < N; i++) {
			System.out.println(city[i]);
		}
	}

}