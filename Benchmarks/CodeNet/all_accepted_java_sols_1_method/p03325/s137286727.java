import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			while(a[i] % 2 == 0) {
				a[i] = a[i] / 2;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
