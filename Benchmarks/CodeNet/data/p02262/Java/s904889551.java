import java.util.Scanner;

public class Main {
	static int cnt = 0;
	static int mcnt = 0;
	static int[] h = {1, 4, 13, 40, 121, 364, 1093, 3280, 9841, 29524, 88573, 265720, 797161, 2391484}; 
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        }
        
        shellSort(a, n);
        System.out.println(mcnt);
        outPut1(h, mcnt);
        System.out.println(cnt);
        outPut2(a, n);
	}
	
	//insertion sort
	public static int[] insertionSort(int[] a, int n, int g) {
		for(int i = g; i < n; i++) {
			int v = a[i];
			int j = i - g;
			while(j >= 0 && a[j] > v) {
				a[j + g] = a[j];
				j = j - g;
				cnt++;
			}
			a[j + g] = v;
		}
		return a;
	}
	
	//shell sort
	public static int[] shellSort(int[] a, int n) {
		for(int i = 0; h[i] <= n; i++) {
			mcnt++;
		}
		for(int i = mcnt; i >= 0; i--) {
			insertionSort(a, n, h[i]);
		}
		return a;
	}
	
	//output array
	public static void outPut1(int[] a, int n) {
		for(int i = n-1; i >= 0; i--) {
			if(i == 0) {
				System.out.println(a[i]);
				break;
			}
			System.out.print(a[i] + " ");
		}
	}
	
	public static void outPut2(int[] a, int n) {
		for(int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}
