import java.util.Scanner;

public class MainC {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < k; i++) {
			int a2[] = new int[n];
			//for(int j = 0; j < n; j++) {
			//	a2[j] = 0;
			//}
			
			for (int j = 0; j < n; j++) {
				int l = j-a[j]>0?j-a[j]:0;
				int h = j+a[j]<n-1?j+a[j]:n-1;
				
				for (int o = l; o <= h; o++) {
					a2[o]++;
				}
			}
			
			a = a2;
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", a[i]);
		}
		
        sc.close();
	}
}