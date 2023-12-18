import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();


		int max = 0;
		for (int i = 0; i < S.length(); i++) {
			int cnt = 0;
			char c = S.charAt(i);
			if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
				cnt = 1;
				for (int j = i+1; j < S.length(); j++) {
					char c2 = S.charAt(j);
					if (c2 == 'A' || c2 == 'C' || c2 == 'G' || c2 == 'T') {
						cnt++;
						continue;
					} else {
						i = j;
						break;
					}
				}
			}
			max  = Math.max(max, cnt);
		}
		System.out.println(max);
	}
}
