import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		ArrayList<Long> maxOptions = new ArrayList<Long>();
		int X = input.nextInt();
		int Y = input.nextInt();
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		long[] a = new long[A];
		long[] b = new long[B];
		long ans = 0;
		for (int i = 0; i < A; i++) {
			a[i] = input.nextLong();
		}
		for (int i = 0; i < B; i++) {
			b[i] = input.nextLong();
		}
		for (int i = 0; i < C; i++) {
			maxOptions.add(input.nextLong());
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = A-1; i >=A-X; i--) {
			maxOptions.add(a[i]);
		}
		for (int i = B-1; i >=B-Y; i--) {
			maxOptions.add(b[i]);
		}
		Collections.sort(maxOptions);
		for (int i = maxOptions.size()-1; i >= maxOptions.size()-X-Y; i--) {
			ans+=maxOptions.get(i);
		}
		System.out.println(ans);
	}
}