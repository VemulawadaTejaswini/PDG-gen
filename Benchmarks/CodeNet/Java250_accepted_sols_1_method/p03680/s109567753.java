import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N + 1];
		
		for(int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
		}
		
		int x = 1;
		int count = 0;
		int check = 0;
		
		for(int i = 1; i <= N; i++) {
			x = a[x];
			count++;
			if(x == 2) {
				System.out.println(count);
				check++;
				break;
			}
		}
		if(check == 0) {
			System.out.println(-1);
		}
	}
}
