import java.util.*;
public class Main{
	public static void main(String args[]){

		Scanner ob = new Scanner(System.in);
		int N = ob.nextInt();
		int count = 0;
		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = ob.nextInt();
		}

		for (int j = 0; j < N; j++) {
			
			if ((a[j] % 2 != 0) && ((j + 1) % 2 != 0)) {
				++count;
			}
		}
		System.out.println(count);
	}
}