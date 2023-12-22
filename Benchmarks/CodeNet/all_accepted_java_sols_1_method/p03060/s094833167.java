import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] V = new int[N];
		int[] C = new int[N];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			V[i] = input.nextInt();
		}
		for (int i = 0; i < N; i++) {
			C[i] = input.nextInt();
		}
		for (int i = 0; i < N; i++) {
			if (V[i]-C[i]>0) ans+=V[i]-C[i];
		}
		System.out.println(ans);
	}
}