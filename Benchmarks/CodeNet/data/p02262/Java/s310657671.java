import java.util.Scanner;

public class Main {
	
	static int n;
	static int a[];
	static int count=0;
	static int m;
	static int g[];
	
	static void insertionSort(int a[],int n,int g) {
		for(int i=g;i<n;i++) {
			int v = a[i];
			int j = i-g;
			while(j>=0 && a[j]>v) {
				a[j+g] = a[j];
				j -= g;
				count++;
			}
			a[j+g] = v;
		}
	}
	
	static void shellSort(int a[],int n) {
		m = 0;
		int t = 1;
		while(t<=n) {
			m++;
			t = 3*t+1;
		}
		g = new int[m];
		g[0] = 1;
		for(int i=1;i<m;i++) {
			g[i] = 3*g[i-1]+1;
		}
		for(int i=0;i<m/2;i++) {
			int temp = g[i];
			g[i] = g[m-1-i];
			g[m-1-i] = temp;
		}
		for(int i=0;i<m;i++) {
			insertionSort(a,n,g[i]);
		}
	}
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 a = new int[n];
		 for(int i=0;i<n;i++) {
			 a[i] = sc.nextInt();
		 }
		 shellSort(a,n);
		 System.out.println(m);
		 System.out.print(g[0]);
		 for(int i=1;i<m;i++) {
			 System.out.printf( " %d",g[i]);
		 }
		 System.out.println();
		 System.out.println(count);
		 for(int i=0;i<n;i++) {
			 System.out.println(a[i]);
		 }
	 }	  
}
