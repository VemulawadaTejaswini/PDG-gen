import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] m = new int[N+1];
		int sum =0;
		for(int i =1;i<=N;i++) {
			m[i] = sc.nextInt();
			sum += m[i];
		}
		int amari = X-sum;
		int min =m[1];
		for(int i=2;i<=N;i++) {
			min = Math.min(min, m[i]);
		}
		int kosuu = amari/min;
		System.out.println(N+kosuu);
		sc.close();
	}

}
