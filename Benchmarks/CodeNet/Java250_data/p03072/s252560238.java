import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		int[] Hmax = new int[N];
		
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
			if(i >= 1) {
				Hmax[i] = Math.max(H[i], Hmax[i - 1]);
			} else {
				Hmax[i] = H[i];
			}
		}
		
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			if(H[i] >= Hmax[i]) {
				sum++;
			}
		}
			
		System.out.println(sum);
		
	}
}
