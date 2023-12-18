import java.util.Scanner;

public class Main {
	public static void swap(int a, int b, int[] li) {
		int tmp = li[a];
		li[a] = li[b];
		li[b] = tmp;
	}
	public static int bubbleSort(int a[], int n) {
		int count = 0;
		boolean flag = true;
		for(int i = 0; flag; i++) {
			flag = false;
			for(int j = n - 1; j > i; j--) {
				if(a[j - 1] > a[j]) {
					swap(j - 1, j, a);
					count++;	flag = true;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int N = scanner.nextInt();
		int[] list = new int[N];
		for(int i = 0; i < N; i++) list[i] = scanner.nextInt();
		int count = bubbleSort(list, N);
		for(int i = 0; i < N; i++) System.out.print(list[i] + (i==N - 1? "\n":" "));
		System.out.println(count);
		scanner.close();
	}
}

