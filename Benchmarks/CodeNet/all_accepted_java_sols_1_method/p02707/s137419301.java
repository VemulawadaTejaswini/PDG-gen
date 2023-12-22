import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] freq = new int[(int)(2*(1e5)+1)];
		for (int i = 0; i < N-1; i++) {
			int x = input.nextInt();
			freq[x]++;
		}
		for (int i = 1; i <= N; i++) {
			System.out.println(freq[i]);
		}
	}
}