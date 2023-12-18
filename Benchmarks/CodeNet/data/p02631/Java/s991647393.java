import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] a = new int[N];
		int XOR = 0;
		for (int i = 0; i < N; i++) {
			int x = input.nextInt();
			XOR^=x;
			a[i]=x;
		}
		for (int i = 0; i < N; i++) System.out.print((XOR^a[i])+" ");
	}
}
