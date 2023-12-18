import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static int insertionSort(int[] arr, int n, int g) {
		int count = 0;
		for(int i = g; i < n; i++) {
			int key = arr[i];
			int j = i - g;
			while(j >= 0 && arr[j] > key) {
				arr[j + g] = arr[j];
				j -= g;
				count++;
			}
			arr[j + g] = key;
		}
		return count;
	}
	public static int shellSort(int[] arr, int n, List<Integer> list) {
		int divisor = 9;
		while(true) {
			int count = 0;
			list.clear();
			int i = 1;
			do {
				list.add(i);
				i = 3 * 1 + 1;
			} while(divisor > 0 && i < n / divisor);
			for(int j = list.size() - 1; j >= 0; j--) {
				count += insertionSort(arr, n, list.get(j));
			}
			if(count <= Math.pow(n, 1.5)) {
				return count;
			} else {
				divisor--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> g = new ArrayList<>();
		int count = shellSort(arr, n, g);
		System.out.println(g.size());
		for(int i = g.size() - 1; i >= 0; i--) {
			if(i == 0) {
				System.out.println(g.get(i));
			} else {
				System.out.println(g.get(i) + " ");
			}
		}
		System.out.println(count);
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}
}

