import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String N = scan.nextLine();
		int n = Integer.parseInt(N);

		String L = scan.nextLine();
		String[] l = L.split(" ");
		long[] a = new long[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = Long.parseLong(l[i]);
		}

		long max = a[0];
		long total = 0;
		for(int i = 1 ; i < n ; i++) {
			if(a[i] < max) {
				total += max - a[i];
			}else {
				max = a[i];
			}
		}

		System.out.println(total);

		scan.close();


	}

}
