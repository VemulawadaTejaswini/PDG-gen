import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//枚数入力
		int N = sc.nextInt();
		int a[] = new int[N+1];
		for(int i = 0;i < N;i++) {
			a[i] = sc.nextInt();
		}
		//大きい順に並び替え
		int max;
		for(int i = 0;i < N;i++) {
			for(int j = i;j < N;j++) {
				if(a[i]<a[j]) {
					max = a[i];
					a[i] = a[j];
					a[j] = max;			
				}
			}
		}
		int A = 0;
		int B = 0;
		for(int i = 0;i < N;i++) {
			if(i % 2 == 0) {
				A = A + a[i];
			}
			if(i % 2 != 0) {
				B = B + a[i];
			}
		}
		//得点差を絶対値化
		int point = Math.abs(A - B);
		System.out.println(point);
		sc.close();
	}
}