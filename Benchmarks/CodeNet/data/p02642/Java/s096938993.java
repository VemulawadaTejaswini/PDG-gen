import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0 ; i < n ; i++) {
			h[i] = sc.nextInt();
		}
		Arrays.sort(h);
		int length = h.length;
		boolean[] checked = new boolean[h[n - 1] + 1];
		Arrays.fill(checked, false);
		for(int i = 0 ;  i < h.length ; i++) {

			if(checked[i])
				continue;

			for(int j = h[i] ; j <= h[n - 1] ; j += h[i]) {

				if(h[i] == j) {

					if(i == 0) {
						if(h[i] == h[i + 1])
							checked[j] = true;
					}
					else if(i == h.length - 1) {
						if(h[i] == h[i - 1])
							checked[j] = true;
					}else
						if(h[i] == h[i + 1] || h[i] == h[i - 1])
							checked[j] = true;
				}
              else
                checked[j] = true;
			}
		}
		int count = 0;
		for(int i = 0 ; i < h.length ; i++) {
			if(!checked[h[i]])
				count++;

		}

		System.out.println(count);

	}
}

