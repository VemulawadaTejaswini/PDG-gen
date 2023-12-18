import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		
		int[] a = new int[N];
		int count = 0;
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if (A % 2 == 0){
				a[count] = A;
				count++;
			}
		}
		int ans = 0;
		for (int i = 0; i < count; i++) {
			int num = a[i];
			while(num%2==0){
				num = num/2;
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
