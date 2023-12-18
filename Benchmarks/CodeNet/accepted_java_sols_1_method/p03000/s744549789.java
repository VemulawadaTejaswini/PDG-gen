import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] spl1 = sc.nextLine().split(" ");
		int N = Integer.parseInt(spl1[0]);
		int X = Integer.parseInt(spl1[1]);
		String[] spl2 = sc.nextLine().split(" ");
		int[] L = new int[N];
		for(int i = 0;i < N;i++) {
			L[i] = Integer.parseInt(spl2[i]);
		}

		int D = 0;//D0 初期値
		int cnt = 1;//カウンタ
		for(int i = 0;i < N;i++) {
			D += L[i];
			if(D > X) break;
			cnt++;
		}
		System.out.println(cnt);
	}
}