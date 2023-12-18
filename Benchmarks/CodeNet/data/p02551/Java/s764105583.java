import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var q = sc.nextInt();
		var q1 = new int[q];
		var q2 = new int[q];
		for (var i = 0; i < q; i++) {
			q1[i] = sc.nextInt();
			q2[i] = sc.nextInt();
		}
		sc.close();

		var sum = (long)(n - 2) * (n - 2);
		var x = new int[n];
		var y = new int[n];
		for (var i = 1; i < n; i++) {
			x[i] = n;
			y[i] = n;
		}
		for (var i = 0; i < q; i++) {
			var qt = q1[i];
			var qv = q2[i];
			if (qt == 1) {
				sum -= x[qv] - 2;
				for (var j = 2; j < x[qv]; j++) {
					y[j] = Math.min(y[j], qv);
				}
			} else {
				sum -= y[qv] - 2;
				for (var j = 0; j < y[qv]; j++) {
					x[j] = Math.min(x[j], qv);
				}
			}
		}
		System.out.println(sum);
	}
}