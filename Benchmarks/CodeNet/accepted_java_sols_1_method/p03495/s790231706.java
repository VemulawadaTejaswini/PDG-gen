import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		int count = 1;
		int check = 0;
		int[] num = new int[N];
		
		for(int i = 1; i < N; i++) {
			if(A[i] == A[i - 1]) {
				count++;
				if(i == N - 1) {
					num[check] = count;
				}
			} else {
				if(i == N - 1) {
					num[check] = count;
					num[check + 1] = 1;
				} else {
					num[check] = count;
					count = 1;
					check++;
				}
			}
		}
		
		int len = 0;
		int[] num2 = new int[N];
		Arrays.sort(num);
		int y = 0;
		
		for(int i = 0; i < N; i++) {
			if(num[i] != 0) {
				len++;
				num2[y] = num[i];
				y++;
			}
		}
		
		if(N == 1) {
			System.out.println(0);
		} else {
			if(len <= K) {
				System.out.println(0);
			} else {
				int sum = 0;
				int x = 0;
				while(len - x > K) {
					sum += num2[x];
					x++;
				}
				System.out.println(sum);
			}
		}
	}
}
