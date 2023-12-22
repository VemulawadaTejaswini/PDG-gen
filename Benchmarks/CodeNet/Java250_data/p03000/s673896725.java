import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int []L = new int[N];

		int zahyou = 0;
		int cnt = 1;

		for (int i=0; i<N; i++) {
			L[i] = sc.nextInt();
		}

		for (int i=0; i<N; i++) {
			int tmp = L[i];
			zahyou+=tmp;
			if (zahyou<=X) {
				cnt+=1;
			} else {
				break;
			}

		}

		System.out.println(cnt);

	}

}
