import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H[] = new int[N];
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		
		int height = Integer.MAX_VALUE;
		for(int i = N - 1; i >= 0; i--) {
			if(height < H[i]) {
				if(height == H[i] - 1) {
					height = H[i] - 1;
				} else {
					System.out.println("No");
					return;
				}
			} else {
				height = H[i];
			}
		}
		System.out.println("Yes");
	}
}
