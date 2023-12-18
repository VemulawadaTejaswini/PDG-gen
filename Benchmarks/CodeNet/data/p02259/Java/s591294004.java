
import java.util.Scanner;

public class Main {
	static int cnt=0;
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        }
        a = bubble(a, n);
        outPut(a, n);
        System.out.println(cnt);
	}
	
	public static int[] bubble(int[] a, int n) {
		boolean flag = true;
		int tmp;
		while(flag) {
			flag = false;
			for(int j = n-1; j > 0; j--) {
				if(a[j] < a[j-1]) {
					tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
					cnt++;
					flag = true;
				}
			}
		}
		return a;
	}
	public static void outPut(int[] a, int n) {
		for(int i = 0; i < n-1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[n-1]);
	}
}
