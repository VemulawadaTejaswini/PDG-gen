import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		Sort s = new Sort();
		s.shellSort(a, n);

		System.out.println(s.G.size());
		for (int i = s.G.size() - 1; i >= 0; i--) {
			System.out.print(s.G.get(i) + ((i == 0) ? "\n" : " "));
		}
		System.out.println(s.cnt);
		for (int i : a) {
			System.out.println(i);
		}
	}

}

class Sort
{
	public int cnt = 0;
	public List<Integer> G = new ArrayList<Integer>();

	public int[] shellSort(int[] a, int n)
	{
		int i = 1;
		while(i < n) {
			this.G.add(i);
			i = i * 3 + 1;
		}

		for (i = this.G.size() - 1; i >= 0; i--) {
			insertionSort(a, n, this.G.get(i));
		}

		return a;
	}

	private int[] insertionSort(int[] a, int n, int g)
	{
		for (int i = g; i < n; i++) {
			int v = a[i];
			int j = i - g;
			while (j >= 0 && a[j] > v) {
				a[j+g] = a[j];
				j = j - g;
				this.cnt++;
			}
			a[j+g] = v;
		}

		return a;
	}
}
