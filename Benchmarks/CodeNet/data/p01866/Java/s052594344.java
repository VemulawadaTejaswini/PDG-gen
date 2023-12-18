import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		char[] X = sc.next().toCharArray();
		char[] next = new char[N];
		int D = sc.nextInt();
		for(int i = 0; i < N; i++) {
			if(D != 0 && X[i] == '0') {
				next[i] = '1';
				D--;
			}
			else {
				next[i] = X[i];
			}
		}
		for(int i = N-1; i >= 0; i--) {
			if(D != 0 && X[i] == '1') {
				next[i] = '0';
				D--;
			}
			else {
				next[i] = X[i];
			}
		}
		
		System.out.println(String.valueOf(X));
	}
}
		
		
		
		