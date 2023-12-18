import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;++i)
			A[i] = sc.nextInt();
		sc.close();
		
		int ans = Integer.MAX_VALUE;
		for(int i = 0;i < N;++i) {
			int num = 0;
			for(int j = 0;j < 42;++j) {
				if(((A[i] >>> j) & 0x01) == 1) {
					num = j;
					break;
				}
			}
			if(ans > num)
				ans = num;
		}
		System.out.println(ans);
	}
}
