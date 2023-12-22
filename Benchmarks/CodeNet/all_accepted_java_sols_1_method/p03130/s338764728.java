import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int [3];
		int[] b = new int [3];

		for(int i = 0;i<3;i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int[] cnt = new int [4];
		for(int i = 0;i<3;i++) {
			cnt[a[i]-1] ++;
			cnt[b[i]-1] ++;
		}
		Arrays.sort(cnt);
		String res = "NO";
		if(cnt[3] < 3) {
			res = "YES";
		}
		System.out.println(res);
	}

}
