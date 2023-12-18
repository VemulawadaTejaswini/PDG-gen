import java.util.Scanner;

public class Main{
	
	public static long Min(long a, long b, long c) {
		long key = a;
		if(a>b) key = b;
		if(key > c) key =c;
		return key;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		long whole=0;
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			whole += a[i];
		}
		sc.close();		
		
		long minmax=0;
		
		
		for(int i=0; i<n-2; i++) {
			long[] size = new long[3];
			
			for(int j=0; j<=i; j++)
				size[0] += a[j];
			
			for(int j=i+1; j<n-1; j++) {
				size[1]=0;
				for(int k=i+1; k<=j; k++) 
					size[1] += a[k];
				
				size[2] = whole - size[0]-size[1];
				
				//System.out.println("(i,j)=("+i+","+j+"),(size[0], size[1], size[2]) = (" + size[0]+","+ size[1]+","+ size[2]+")");
				
				long min = Min(size[0], size[1], size[2]);
				if(min>minmax) minmax=min;
				
			}
		}
		
		System.out.println(minmax);
	
	}
}