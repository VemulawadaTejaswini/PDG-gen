import java.util.Scanner;

// https://atcoder.jp/contests/abc144/tasks/abc144_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		int ans = -1;

		if(A<10&&B<10){
			ans = A * B;
		}
		System.out.println(ans);
//		int[] array = new int[N];
//		for(int i=0;i<N;i++) {
//			array[i]=sc.nextInt();
//		}
//		sc.close();
	}
}
