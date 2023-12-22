import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int a[] = new int[N];
		for(int i = 0;i < N;i++) {
			a[i] = sc.nextInt();
			if(D - 1/a[i] == 0) {
				a[i] = 1;
			}else {
				a[i] = (D - 1)/a[i];
			}
		}
		for(int i = 0;i < N;i++) {
			X = X + a[i];
		}
		System.out.println(X + N);
		sc.close();
	}
}