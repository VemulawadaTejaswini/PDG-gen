import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int N = sc.nextInt();
		int p[] = new int[N];

		int a = X;
		int ans1 = X;
		int ans2 = X;
		int s = 0;

		for(int i = 0;i<N;i++) {
			p[i] = sc.nextInt();
		}
		for(int i = 0 ;i<N+1;i++) {
			for(int j = 0;j<N;j++) {
				if(p[j]!=X) {
					s++;
				}
			}
			if(s==N) {
				ans1 = X;
				break;
			}
			s=0;
			X = X-1;
		}
		X=a;
		s=0;
		for(int i = 0 ;i<N+1;i++) {
			for(int j = 0;j<N;j++) {
				if(p[j]!=X) {
					s++;
				}
			}
			if(s==N) {
				ans2 = X;
				break;
			}
			s=0;
			X = X+1;
		}

		X=a-ans1;
		N=ans2-a;

		if(X<=N) {
			System.out.println(ans1);
		}else {
			System.out.println(ans2);
		}

	}

}
