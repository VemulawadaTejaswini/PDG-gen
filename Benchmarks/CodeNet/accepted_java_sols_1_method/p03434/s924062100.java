import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		Integer[] a = new Integer[N];
		for(int i = 0; i < N; i++) {
			a[i] = stdIn.nextInt();
		}
		Arrays.sort(a, Collections.reverseOrder());
		
		int A = 0;
		int B = 0;
		for(int i = 0; i < N; i++) {
			if(i%2 == 0) A += a[i];
			else B += a[i];
		}
		System.out.println(A-B);

	}

}