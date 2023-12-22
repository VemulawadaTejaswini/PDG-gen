import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		int bc[][] = new int[m][2];
		for(int i = 0; i < m; i++){
			bc[i][0]= sc.nextInt();
			bc[i][1] = sc.nextInt();
		}
		Arrays.sort(bc,(b,c) -> Integer.compare(b[1],c[1]));
		int[] na = new int[n];
		int idx = 0;
		Arrays.sort(a);
		for(int j = m-1; j >= 0; j--){
			int mai = 0;
			for(;idx < n&&mai < bc[j][0]&&a[idx] < bc[j][1];idx++){
				na[idx] = bc[j][1];
				mai++;
			}
		}
		long ans = 0;
		if(idx < n){
			for(;idx < n;idx++){
				na[idx] = a[idx];
			}
		}
		for(int i = 0; i < n; i++){
			ans = (long)ans+na[i];
		}
		System.out.print(ans);
	}
}
