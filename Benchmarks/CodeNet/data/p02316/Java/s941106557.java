import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = sc.nextInt();
		int[] v = new int[n];
		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}
		int[] t = new int[max + 1];
		for (int i = 0; i < n ; i++) {
			for (int j = w[i]; j <= max; j++) {
				t[j] = Math.max(t[j], t[j - w[i]] + v[i]);
			}
		}
		System.out.println(t[max]);
		sc.close();
    }
}

