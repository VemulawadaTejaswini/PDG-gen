

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int b[] = new int[m];
		for(int i=0;i<m;i++){
			b[i] = sc.nextInt();
		}
		int c[] = new int[n+m];
		System.arraycopy(a,0,c,0,a.length); //a???c????????????
		System.arraycopy(b,0,c,a.length, b.length); //b???c????????????
		Arrays.sort(c);
		for(int i=1;i<m+n;i++){
			if(c[i]==c[i-1]){
				result++;
			}
		}
		System.out.println(result);
	}

}