import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner (System.in); 
	public static void main(String args[]){
		run();
	}
	static void run(){
		int n;
		n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = scan.nextInt();
		}
		shellSort(a, n);
		for(int i = 0; i < n; i++){
			
		}
	}
	static int insertSort(int[] a, int n, int g, int cnt){
		int v, j;
		for(int i = g; i < n; i++){
			v = a[i];
			j = i - g;
			while(j >= 0 && a[j] > v){
				a[j + g] = a[j];
				j = j - g;
				cnt++;
			}
			a[j + g] = v;
		}
		return cnt;
	}
	static void shellSort(int[] a, int n){
		int cnt, m;
		cnt = 0;
		m = 3;
		int[] g = {4, 2, 1};
		for(int i = 0; i < m; i++){
			cnt = insertSort(a, n, g[i], cnt);
		}
		System.out.println(m);
		for(int i = 0; i < m; i++){
			if(i == m - 1){
				System.out.println(g[i]);
			}else{
				System.out.print(g[i]+" ");
			}
		}
		System.out.println(cnt);
		for(int i = 0; i < n; i++){
			System.out.println(a[i]);
		}
	}
}