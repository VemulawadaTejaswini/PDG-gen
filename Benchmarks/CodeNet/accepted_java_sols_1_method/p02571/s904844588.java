public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var S = sc.next();
		var T = sc.next();

		var res = T.length();
		for (var i = 0; i <= S.length() - T.length() ; i++) {
			var cnt = 0;
			for (var j = 0; j < T.length(); j++) {
				if (S.charAt(i + j) != T.charAt(j)) {
					cnt++;
				}
			}
			res = Math.min(res, cnt);
		}
		System.out.println(res);

	}
}
