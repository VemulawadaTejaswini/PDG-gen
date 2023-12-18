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
		long[] size = new long[3];
		
		for(int i=0; i<n-2; i++) { //1つめの切り込み
			for(int j=i+1; j<n-1; j++) { //2つめの切り込み
				size[0]=0;
				for(int k=i; k<j; k++) 
					size[0]+=a[k];
					
				for(int k=j+1; k<n; k++) { //3つめの切り込み
					size[1]=0;
					for(int m=j; m<k; m++)
						size[1]+=a[m];
				
						size[2] = whole - size[0]-size[1];
				
						//System.out.println("(i,j,k)=("+i+","+j+","+k+"),(size[0], size[1], size[2]) = (" + size[0]+","+ size[1]+","+ size[2]+")");
				
				long min = Min(size[0], size[1], size[2]);
				if(min>minmax) minmax=min;
				}
			}
		}
		
		System.out.println(minmax);
	
	}
}