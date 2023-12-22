import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = Integer.parseInt(sc.nextLine());
		long ans;

		long r_List,g_List,b_List;
		r_List=g_List=b_List=0;

		String string = sc.nextLine();

		for (int i = 0; i < A; i++) {
			char c = string.charAt(i);
			if (c == 'R') {
				r_List++;
			} else if(c == 'G'){
				g_List++;
			} else if(c == 'B'){
				b_List++;
			}
		}

		ans = r_List * g_List * b_List;

		for (int i = 0; i < A; i++) {
			for (int j = i+1; j < A; j++) {
				if (string.charAt(i) == string.charAt(j)) {
					continue;
				}
				int k = j * 2 - i;
				if (k >= A || string.charAt(i) == string.charAt(k) || string.charAt(j) == string.charAt(k)) {
					continue;
				}
				ans--;
			}
		}

		System.out.println(ans);
	}
}