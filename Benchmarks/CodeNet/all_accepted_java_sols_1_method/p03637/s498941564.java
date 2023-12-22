import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long[] a = new long[N];
		
		int x1 = 0;
		int x2 = 0;
		int x4 = 0;
		
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
			if(a[i] % 2 != 0) {
				x1++;
			} else if(a[i] % 2 == 0 && a[i] % 4 != 0) {
				x2++;
			} else if(a[i] % 4 == 0) {
				x4++;
			}
		}
		
		if(x4 >= x1) {
			System.out.println("Yes");
		} else if(x4 + 1 == x1 && x4 + x1 == N) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
