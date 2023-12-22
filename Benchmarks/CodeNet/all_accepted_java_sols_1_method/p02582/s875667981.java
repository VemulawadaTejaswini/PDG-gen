public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var s = sc.next();
		var max = 0;
		var cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				cnt++;
			} else {
				cnt = 0;
			}
			max = Math.max(cnt, max);
		}
		System.out.println(max);

	}
}
