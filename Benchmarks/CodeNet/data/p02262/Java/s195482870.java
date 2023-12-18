

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
		printArray(shellSort(a,n));

		in.close();
	}
	int cnt = 0;
	int[] insertionSort(int[]a, int n, int g){
		for(int i = g; i < n; i++){
			int v = a[i];
			int j = i - g;
			while(j >= 0 && a[j] > v){
				a[j+g] = a[j];
				j -= g;
				cnt++;
			}
			a[j+g] = v;
		}
		return a;
	}
	int[] shellSort(int[] a, int n){
		cnt = 0;
		int m = 2;
		int[] g = new int[m];
		for(int i = 0; i < m; i++){
			g[m-i-1] = (int)Math.pow(4, i);
		}
		for(int i = 0; i < m; i++){
			a = insertionSort(a,n,g[i]);
		}
		System.out.println(m);
		printArray2(g);
		System.out.println(cnt);
		return a;
	}
	void printArray(int[] a){
		for(int x : a){
			System.out.println(x);
		}
	}
	void printArray2(int[] a){
		System.out.print(a[0]);
		for(int i= 1; i < a.length; i++){
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}


}