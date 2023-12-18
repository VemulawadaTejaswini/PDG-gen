import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			long[] A = new long[N];
			for(int j=0; j<N; j++)
				A[j] = sc.nextLong();
			char[] s = sc.next().toCharArray();
			
			System.out.println(solve(A, s));
		}
		
		sc.close();
	}
	
	static int solve(long[] A, char[] s) {
		int N = A.length;

		long[] m = new long[N];
		int size = 0;
		for(int i=N-1; i>=0; i--) {
			if(s[i]=='0') {
				m[size] = A[i];
				size++;
			} else {
				long[] work = new long[size+1];
				work[0] = A[i];
				for(int j=0; j<size; j++)
					work[j+1] = m[j];
				if(!couldBeZero(work)) {
					return 1;
				}
			}
		}
		
		return 0;
	}
	
	static boolean couldBeZero(long[] m) {
		int N = m.length;
		for(int i=0; i<60; i++) {
			int baseIndex = -1;
			for(int j=1; j<N; j++) {
				if((m[j]&(1l<<i))!=0) {
					baseIndex = j;
					break;
				}
			}
			if(baseIndex<0)
				continue;
			long base = m[baseIndex];
			for(int j=0; j<N; j++) {
				if((m[j]&(1l<<i))!=0) {
					m[j] ^= base;
				}
			}
		}
		return m[0] == 0;
	}
}
