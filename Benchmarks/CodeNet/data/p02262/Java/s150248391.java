import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int data[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}
		scan.close();
		
		ShellSort(data, n);
		
	}
	
	public static int InsertionSort(int A[], int n, int g, int cnt) {
		
		int a;
		
		for (int i = g; i < n; i++) {
			int v = A[i];
			int j = i - g;
			while (j >= 0 && A[j] > v) {
				j = j - g;
				cnt++;
			}
			
			a = A[j + g];
			A[ j + g] = v;
			A[i] = a;
		}
		
		return cnt;
	}
	
	public static void ShellSort(int A[], int n) {
		int cnt = 0;
		int m = n / 2;
		int G[] = new int[m];
		
		System.out.println(m);
		
		for (int i = 0; i < m; i++) {
			G[i] = A[m - i];
			cnt = InsertionSort(A, n, G[i], cnt);
			System.out.print(G[i] + " ");
		}
		System.out.println();
		System.out.println(cnt);
		
		
		for (int i = 0; i < n; i++) {
			System.out.println(A[i]);
		}
		
	}
}

