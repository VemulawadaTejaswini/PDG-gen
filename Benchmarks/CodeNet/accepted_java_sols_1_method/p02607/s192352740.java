import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N+1];
		int cnt = 0;
		
		for(int i=1; i<=N; i++) {
			a[i] = sc.nextInt();
//			System.out.println(a[i] % 2);
//			System.out.println(i % 2);
			if (a[i] % 2 == 1 && i % 2 == 1) {
				cnt += 1;
			} 
		}
				
		System.out.println(cnt);
		sc.close();
	}
}