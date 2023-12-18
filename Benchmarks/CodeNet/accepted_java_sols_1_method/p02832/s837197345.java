import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		Arrays.setAll(a, i -> sc.nextInt());
		int ans = 0, key = 1;
		for(int i = 0; i < N; i++) {
			if(a[i] == key) {
				key++;
			}
			else
				ans++;
		}
		System.out.println(key == 1 ? -1 : ans);

	}

}