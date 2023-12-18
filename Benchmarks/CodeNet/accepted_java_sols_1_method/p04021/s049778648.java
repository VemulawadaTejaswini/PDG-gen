import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		
		int[] odd = new int[N-N/2];
		int[] even = new int[N/2];
		
		for(int i=0; i<N; i++)
			if(i%2==0)
				odd[i/2]=A[i];
			else
				even[i/2]=A[i];
		
		Arrays.sort(A);
		Arrays.sort(odd);
		Arrays.sort(even);
		
		int ans = 0;
		int oi=0,ei=0;
		for(int i=0; i<N; i++) {
			if(oi<N-N/2 && A[i]==odd[oi]) {
				if(i%2!=0)
					ans++;
				oi++;
			} else {
				if(i%2==0)
					ans++;
				ei++;
			}
		}
		
		System.out.println(ans/2);
		sc.close();
	}
}
