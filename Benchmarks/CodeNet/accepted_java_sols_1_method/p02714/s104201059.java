import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var s = sc.next();
		sc.close();

		var r = 0;
		var g = 0;
		var b = 0;
		var rc = new int[n];
		var gc = new int[n];
		var bc = new int[n];
		for (var i = n - 1; i >= 0; i--) {
			if (s.substring(i, i + 1).equals("R")) {
				r++;
			} else if (s.substring(i, i + 1).equals("G")) {
				g++;
			} else {
				b++;
			}
			rc[i] = r;
			gc[i] = g;
			bc[i] = b;
		}

		var sum = 0L;
		for (var i = 0; i < n - 2; i++) {
			var s1 = s.substring(i, i + 1);
			for (var j = i + 1; j < n - 1; j++) {
				var s2 = s.substring(j, j + 1);
				if (!s1.equals(s2)) {
					var s3 = "RGB".replace(s1, "").replace(s2, "");
					if (s3.equals("R")) {
						sum += rc[j + 1];
					} else if (s3.equals("G")) {
						sum += gc[j + 1];
					} else {
						sum += bc[j + 1];
					}
					var k = j + (j - i);
					if (k < n) {
						var s4 = s.substring(k, k + 1);
						if (s3.equals(s4)) {
							sum--;
						}
					}
				}
			}
		}

		System.out.println(sum);
	}
}