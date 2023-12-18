import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer> G = new ArrayList<>();
	static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		shellSort(num,n);
		System.out.println(G.size());
		for (int i = 0; i < G.size(); i++) {
			if (i == G.size() - 1) {
				System.out.print(G.get(i));
			} else {
				System.out.print(G.get(i) + " ");
			}
		}

		System.out.println();

		System.out.println(cnt);

		for (int i = 0; i < n; i++) {
			System.out.println(num[i]);
		}


	}

        static void shellSort(int[] num, int n) {
		for (int h = 1; ;) {
			if (h > n) break;
			G.add(0, h);
			h = 3 * h + 1;
		}

		for (int i = 0; i < G.size(); i++) {
			insertionSort(num, n, G.get(i));
		}
	}

	static void insertionSort(int[] num, int n, int g) {
		for (int i = g; i < n; i++) {
			int key = num[i];
			int j = i - g;
			while (j >= 0 && num[j] > key) {
				num[j + g] = num[j];
				j -= g;
				cnt++;
			}
			num[j + g] = key;
		}
	}

}


