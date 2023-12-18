import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int m = sc.nextInt();
			int p = sc.nextInt();
			int q = sc.nextInt();
			int r = sc.nextInt();
			int x, y;
			
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i=0;i<n;i++) a[i] = i+1;
			
			for(int i=0;i<m;i++){
				x = sc.nextInt();
				y = sc.nextInt();
				
				for(int j=0;j<y;j++) b[j] = a[j];
				for(int j=y;j<n;j++) a[j-y] = a[j];
				for(int j=0;j<y-x;j++) a[n-y+j] = b[x+j];
				for(int j=0;j<x;j++) a[n-x+j] = b[j];
			}
			int count = 0;
			for(int j=p-1;j<q;j++){
				if(a[j]<=r) count++;
			}
			System.out.println(count);
		}	
	}	
}