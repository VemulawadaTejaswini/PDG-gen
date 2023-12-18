import java.util.*;
import java.lang.Math.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] b = new int[m];
		for(int i = 0; i < m; i++) b[i] = sc.nextInt();
		boolean flag = true;
		for(int i = 0; i < Math.min(n, m); i++){
			if(a[i] < b[i]){
				System.out.println(1);
				return;
			}
			if(a[i] > b[i]){
				System.out.println(0);
				return;
			}
		}
		if(m > n) System.out.println(1);
		else System.out.println(0);
	}
}

