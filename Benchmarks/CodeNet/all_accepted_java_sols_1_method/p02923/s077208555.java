import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = in.nextInt();
		}

		int j = 0;
		int max = 0;

		int prev = h[j++];
		while(j < h.length) {
			int c = 0;

			int current = h[j++];
			while(prev >= current && j < h.length) {
				prev = current;
				current = h[j++];
				c++;
			}

			if(j == h.length) {
				if(prev >= current)
					c++;
			}

			if(max < c)
				max = c;

			prev = current;
		}

		System.out.println(max);
		return;
	}
}
