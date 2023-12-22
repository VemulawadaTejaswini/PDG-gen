import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];
		int count = 0;
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < M; j++) {
				if(a[j] == i) count++;
				else if(b[j] == i) count++;
			}
			System.out.println(count);
			count = 0;
		}

	}

}