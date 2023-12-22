import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();

		int[] a = new int[n];
		int[] d = new int[(int)(1e5+1)];
		long ans = 0;

		for(int i = 0;i < n; i++) {
			a[i] = stdIn.nextInt();
			d[a[i]]++;
			ans += a[i];
		}


		int q = stdIn.nextInt();
/*
		int[] b = new int[q];
		int[] c = new int[q];

*/
		for(int i = 0; i < q; i++) {
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();

	//		System.out.println("d[b]:"+d[b]);

			if(d[b] != 0) { //もし要素がひとつでもあれば
				ans += (c - b)*d[b];
				d[c] += d[b];
				d[b] = 0;
				System.out.println(ans);
				continue;
			}
			System.out.println(ans);
		}



	}
}
