import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> anList = new ArrayList<Integer>();

		for(int i = 0; i < N; i++) {
			anList.add(sc.nextInt());
		}

		Collections.sort(anList, Comparator.naturalOrder());

		System.out.println(anList.get(N-1) - anList.get(0));
	}
}