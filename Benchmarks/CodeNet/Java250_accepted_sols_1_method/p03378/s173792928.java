import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
		int a[] = new int[m];
		int tmp = 0, tmp2 = 0;
		for(int i = 0; i < m; ++i) {
			a[i] = sc.nextInt();
			if(a[i] < x)++tmp;
			else ++tmp2;
		}
		sc.close();
		int ans = 0;
		ans = Math.min(tmp, tmp2);
		System.out.println(ans);
	}

}
