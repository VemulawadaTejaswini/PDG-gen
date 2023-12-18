import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		long[] bool = new long[100001];
		for(int i = 0 ; i < 100001; i++) {
			bool[i]	 = 0;
		}
		//System.out.println(1);
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			bool[a[i]]++;
		}
		//System.out.println(2);
		int q = sc.nextInt();
		int[] b = new int[q];
		int[] c = new int[q];
		for(int i = 0; i < q; i++) {
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		//System.out.println(3);
		long[] sa = new long[q];
		java.util.Arrays.sort(a);
		for(int i = 0; i < q; i++) {
			if(bool[b[i]] > 0) {
				//System.out.println(bool[b[i]]);
				sa[i] += bool[b[i]]*(c[i] - b[i]);
				bool[c[i]] += bool[b[i]];
				bool[b[i]] = 0;
			}
		}
		long sum = 0;
		for(int i = 0; i < n; i++) {
			sum+= (long)a[i];
		}
		for(int i = 0; i < q; i++) {
			sum+= sa[i];
			System.out.println(sum);
		}
	}
}