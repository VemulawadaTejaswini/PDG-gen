import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); long count = 0;
		int[] a = new int[n+1]; int[] b = new int[n];

		for(int i = 0; i < n+1; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		for(int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(sc.next());
		}

		for(int i = 0; i < n; i++) {
			if(a[i] >= b[i]) {
				count += b[i];
			}else {
				b[i] -= a[i];
				count += a[i];
				if(a[i+1] > b[i]) {
					a[i+1] -= b[i];
					count += b[i];
				}else {
					count += a[i+1];
					a[i+1] = 0;
				}

			}
		}
		System.out.println(count);

		sc.close();
	}

}