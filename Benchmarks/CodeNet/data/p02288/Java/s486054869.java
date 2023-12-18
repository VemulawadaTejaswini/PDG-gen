import java.util.*;

public class Main {

	public static void main(String[] args)  {

		Scanner in = new Scanner(System.in);
		

		int H = in.nextInt();

		int[] a = new int[H + 1];

		for (int i = 1; i <= H; i++)
			a[i] = in.nextInt();

		for (int i = H / 2; i >= 1; i--)
			maxHeapify(a, i);

		for (int i = 1; i <= H; i++)
			System.out.print(" " + a[i]);
		System.out.print("\n");
		
		

		in.close();
		
	}

	private static void maxHeapify(int[] a, int i) {
		int l = i * 2;
		int r = i * 2 + 1;
		
		int max = i;
		// is the largest on the left
		if (l < a.length && a[l] > a[i])
			max = l;
		// of is the largest on the right
		if (r < a.length && a[r] > a[max])
			max = r;
		// if the maximum isn't the current position...
		if (max != i) {
			int tmp = a[i];
			a[i] = a[max];
			a[max] = tmp;
			maxHeapify(a, max);
		}
	}
}
	

