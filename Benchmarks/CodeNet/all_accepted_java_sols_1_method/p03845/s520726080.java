import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			t[i] = sc.nextInt();
			sum+=t[i];
		}
		int m = sc.nextInt();
		int[] a = new int[m];
		for(int i=0;i<m;i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			a[i]=sum-t[p-1]+x;
		}
		for(int i=0;i<m;i++) {
			System.out.println(a[i]);
		}
	}

}
