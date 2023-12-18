import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] array = new long[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextLong();
		}
		Sort st = new Sort();
		st.shellSort(array);
	}
}

class Sort {
	int count;
	
	public Sort() {
		count = 0;
	}
	
	public int insertionSort(long[] array, int g) {
		long v;
		int j;
		for (int i = g; i < array.length; i++) {
			v = array[i];
			j = i - g;
			while (j >= 0 && array[j] > v) {
				array[j + g] = array[j];
				j -= g;
				count++;
			}
			array[j + g] = v;
		}
		return count;
	}
	
	public void shellSort(long[] array) {
		count = 0;
		int[] g = new int[100];
		g[0] = (int) Math.pow((int) Math.sqrt(array.length), 2);
		int m = g.length / 2 + 1;
		for (int i = 1; i < g.length; i++) {
			g[i] = g[i - 1] / 2;
			if (g[i] <= 0 && g[i - 1] > 0) {
				g[i] = 1;
				break;
			}
		}
		System.out.println(g.length);
		for (int i = 0; i < g.length - 1; i++) {
			System.out.print(g[i] + " ");
		}
		
		System.out.println(g[g.length - 1]);
		for (int i = 0; i < m; i++) {
			if (g[i] == 0) {
				break;
			}
			insertionSort(array, g[i]);
		}
		System.out.println(insertionSort(array, 0));
		output(array);
	}
	
	public void output(long[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

