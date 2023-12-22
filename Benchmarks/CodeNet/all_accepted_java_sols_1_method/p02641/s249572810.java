public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var x = sc.nextInt();
		var n = sc.nextInt();
		var p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		var used = new boolean[102];
		for (int i = 0; i < used.length; i++) {
			used[i] = false;
		}
		for (int i = 0; i < p.length; i++) {
			used[p[i]] = true;
		}
		var minabs = 1000;
		var minid = x;
		for (int i = 0; i < used.length; i++) {
			if (!used[i]) {
				var abs = Math.abs(x - i);
				if (abs < minabs) {
					minid = i;
					minabs = abs;
				}
			}
		}
		System.out.println(minid);

	}
}
