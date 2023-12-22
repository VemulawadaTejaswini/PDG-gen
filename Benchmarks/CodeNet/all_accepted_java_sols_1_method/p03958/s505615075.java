import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int T = sc.nextInt();
		int[] a = new int[T];
		for(int i=0; i<T; i++)
			a[i] = sc.nextInt();
		
		Arrays.sort(a);
		
		System.out.println(Math.max(a[T-1]-(K-a[T-1])-1,0));
		
		sc.close();
	}
}
