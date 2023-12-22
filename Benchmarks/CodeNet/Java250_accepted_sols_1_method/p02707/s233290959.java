import java.util.HashMap;
import java.util.Scanner;

class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n-1];
		for(int i=0;i<n-1;i++)
			a[i] = sc.nextInt();
		int res[] = new int[n];
		for(int i=0;i<a.length;i++) {
			res[a[i]-1]=res[a[i]-1]+1;
		}
		for(int i=0;i<n;i++) {
			System.out.println(res[i]);
		}
	}
}