import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int M = stdIn.nextInt();
		int[] a = new int[A];
		int[] b = new int[B];
		int minA = (int)1e6;
		int minB = (int)1e6;
		for(int i = 0; i < A; i++) {
			a[i] = stdIn.nextInt();
			if(a[i] < minA) minA = a[i];
		}
		for(int i = 0; i < B; i++) {
			b[i] = stdIn.nextInt();
			if(b[i] < minB) minB = b[i];
		}
		
		int min = minA+minB;
		for(int i = 0; i < M; i++) {
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			int c = stdIn.nextInt();
			if(a[x-1]+b[y-1]-c < min) {
				min = a[x-1]+b[y-1]-c;
			}
		}
		
		System.out.println(min);

	}

}