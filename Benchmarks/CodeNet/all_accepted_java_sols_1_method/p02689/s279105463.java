import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		int[] a = new int[m];
		int[] b = new int[m];
		int[] no = new int[n];
		for(int i = 0; i < n; i++) {
			no[i] = 0;
		}
		for(int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			if( h[a[i]-1] >= h[b[i]-1] ) {
				no[b[i]-1] = 1; 
			}
			if( h[a[i]-1] <= h[b[i]-1]){
				no[a[i]-1] = 1;
			}
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			if( no[i] == 0) {
				//System.out.println(i+1);
				count++;
			}
		}
		
		System.out.println(count);
	}
}