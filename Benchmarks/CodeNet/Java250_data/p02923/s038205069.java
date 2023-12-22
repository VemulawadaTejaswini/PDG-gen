import java.util.Scanner;

public class Main {
	public static int ceil(int a, int b){
		int x = (a + (b - 1))/b;
		return x;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H[] = new int[N];
		int ans = 0;
		int tmp = 0;
		
		for(int i=0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		
		for(int i=1; i < N; i++) {
			if(H[i-1] >= H[i]) {
				tmp += 1;
			} else {
				ans = Math.max(ans, tmp);
				tmp = 0;
			}
		}
		ans = Math.max(ans, tmp);
		// 出力
		System.out.println(ans);
	}
}