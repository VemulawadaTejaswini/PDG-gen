import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int A[] = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = sc.nextInt();
		}
		boolean b = true;
		int count = 0;
		int countmax = 0;

		while(b) {
			count = 0;
			for(int i = 0;i < N;i++) {
				if(A[i] % 2 == 0) {
					count++;
				}
			}
			if(count == A.length) {
				for(int i = 0;i < N;i++) {
					A[i] = A[i]/2;
				}
				countmax++;

			}else{
				b = false;
			}
		}
		System.out.println(countmax);

//		Arrays.sort(S);
//		int count = 0;
//		for(int i = 1;i < S.length;i++) {
//			if(S[i] == S[i-1])continue;
//			count++;
//		}
//		System.out.println(count);
	}
}
