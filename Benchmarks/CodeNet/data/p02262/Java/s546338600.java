import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	private List<Integer> G = new ArrayList<Integer>();
	private int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(reader.readLine());
		}
		reader.close();
		
		shellSort(a, n);
		System.out.println(G.size());
		for (int i = G.size() - 1; i >= 0; i--) {
			System.out.print(G.get(i));
			if (i != 0) System.out.print(" ");
		}
		System.out.println();
		System.out.println(cnt);
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

	private void shellSort(int[] a, int n) {
		int h = 1;
		while (h <= n) {
			G.add(h);
			h = h * 3 + 1;
		}
		for (int i = G.size()-1; i >= 0; i--) {
			insertionSort(a, n, G.get(i));
		}
	}

	private void insertionSort(int[] a, int n, int g) {
		for (int i = g; i < n; i++) {
			int v = a[i];
			int j = i - g;
			while (j >= 0 && a[j] > v) {
				a[j+g] = a[j];
				j -= g;
				cnt+=1;
			}
			a[j+g] = v;
		}
	}
}

