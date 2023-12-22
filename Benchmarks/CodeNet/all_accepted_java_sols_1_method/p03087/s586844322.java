import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt();
		String s = sc.next();
		int ac[] = new int[n];
		String tmp = "AC", tmp2 = "";
		for (int i = 0; i < n - 1; ++i) {
			ac[i + 1] = ac[i];
			tmp2 = s.substring(i,  i + 2);
			if (tmp2.equals(tmp)) 
				ac[i + 1] = ac[i] + 1;
		}
		for (int i = 0; i < q; ++i) {
			int l = sc.nextInt(), r = sc.nextInt();
			int ans = ac[r - 1] - ac[l - 1];
			System.out.println(ans);
		}
		sc.close();

	}

}
