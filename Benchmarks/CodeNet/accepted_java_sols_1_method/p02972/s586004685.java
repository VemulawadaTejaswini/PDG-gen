import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N+1];
		for(int i = 1; i <= N; i++)
			a[i] = sc.nextInt();
		int[] b = new int[N+1];
		int M = 0;
		for(int i = N; i >= 1; i--) {
			int x = 0;
			for(int j = i; j <= N; j += i)
				x += b[j];
			if(x % 2 != a[i]){
				b[i] = 1;
				M++;
			}
		}
		System.out.println(M);
		for(int i = 1; i <= N; i++) {
			if(b[i] == 1)
				System.out.println(i);
		}

	}

}
