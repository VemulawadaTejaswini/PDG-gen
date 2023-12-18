import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H;
		H = new int[N];
		int sum = 1;
		for(int n = 0; n < N; n++) {
			H[n] = sc.nextInt();
			int max = H[0];
			for(int index = 0; index < H.length; index++) {
				max = Math.max(max, H[index]);
			}
			if(n != 0) {
				if(H[n] >= H[n - 1] && H[n] >= max) {
					sum ++;
				}
			}
		}
		sc.close();
		System.out.print(sum);
	}
}