import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int x = Integer.parseInt(arr[1]);
		int[] m = new int[n];
		for(int i=0; i<n; i++) {
			m[i] = Integer.parseInt(sc.nextLine());
		}
		sc.close();

		int left = x;
		int min = 1000;
		for(int val: m) {
			left -= val;
			if (min > val)
				min = val;
		}
		System.out.println(n+(int)(left/min));
	}
}
