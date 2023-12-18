import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	static int N;

	public static void main(String[] args){

		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = scan.nextInt();
		}

		shellSort(arr, n);
	}

	static int inserSort(int[] a, int n, int g, int cnt){
		int v, j;
		for(int i = g; i < n; i++){
			v = a[i];
			j = i - g;
			while(j >= 0 && a[j] > v){
				a[j+g] = a[j];
				j = j - g;
				cnt++;
			}
			a[j+g] = v;
		}
		return cnt;
	}

	static void shellSort(int[] a, int n){
		int cnt, m, count, gCheck;
		cnt = 0;
		count = 0;
		gCheck = 1;

		while(n > gCheck){
			gCheck = gCheck * 2 + 1;
			count++;
		}
		if(count == 0)
			count = 1;
		m = count;
		int[] g = new int[m];
		g[m-1] = 1;

		for(int i = 1; i < m; i++){
			g[m-i-1] = g[m-i] * 2 + 1;
		}

		for(int i = 0; i < m; i++){
			cnt = insertSort(arr, n, g[i], cnt);
		}

		System.out.println(m);
		for(int i = 0; i < m; i++){
			System.out.printf(i != m-1? "%d " : "%d\n", g[i]);
		}
		System.out.printf("%d\n", cnt);
		for(int i = 0; i < n; i++){
			System.out.printf("%d\n", arr[i]);
		}
	}
}