import java.util.*;

public class Main {
	
//	public static String rev(int s) {
//		 String rev = new StringBuffer(s).reverse().toString();
//		 return rev;
//	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		
	
		//int l1 = st1.length();
		int[] A = new int[n];
		int[] B = new int[m];
		int[] C = new int[n+m];
		//int cnt = 0;
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			}
		
		for(int i = 0; i < m; i++) {
			B[i] = sc.nextInt();
			}
		
		for(int i = 0; i < n+m; i++) {
			if(i<n) C[i] = A[i];
			else C[i] = B[i-n];
		}
		
		Arrays.sort(C);
		
		long time = 0L;
		int cnt = 0;
		
		boolean flag = true;
		
		if(k<C[0]) {
			System.out.println(0);
			return;
		}
		
		while(flag) {
			for(int i = 0; i<n+m; i++) {
				if(time <= k) {
					time += C[i];
					cnt++;
				}else {
					flag=false;
					break;
				}
			}
			
		}
      
		
        	
        	System.out.println(cnt-1);
        }
        	
}