import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ShellSort {
	List<Integer> g;
	int[] preserve;

	ShellSort(int[] arr) {
		preserve = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			preserve[i] = arr[i];
		}
	}

	public int insertionSort(int[] arr, int n, int g) {
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
	public int shellSort(int[] arr, int n, List<Integer> list) {
		int e = 1;
		do {
			list.add(e);
			e = 3 * e + 1;
		} while(e <= n / 9);
		int count = 0;
		while(true) {
			for(int i = list.size() - 1; i >= 0; i--) {
				count += insertionSort(arr, n, list.get(i));
			}
			if(count < Math.ceil(Math.pow(n, 1.5))) {
				return count;
			} else {
				count = 0;
				e = 3 * e + 1;
				list.add(e);
				for(int i = 0; i < n; i++) {
					arr[i] = preserve[i];
				}
			}
		}
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		ShellSort shell = new ShellSort(arr);
		List<Integer> g = new ArrayList<>();
		int count = 0;
		count = shell.shellSort(arr, n, g);
		System.out.println(g.size());
		for(int i = g.size() - 1; i >= 0; i--) {
			if(i == 0) {
				System.out.println(g.get(i));
			} else {
				System.out.print(g.get(i) + " ");
			}
		}
		System.out.println(count);
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
