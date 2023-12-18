import java.util.*;
public class Main{
	static int a[],n,i,j,ans[],cnt;
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNextInt()){
			int n=sc.nextInt();
			int a[]=new int[n];
			if(n==0)break;
			int max = Integer.MIN_VALUE;
			for( i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++){
				int sum = 0;
				for(int j = i; j < n; j++) {
					sum += a[j];
					if(sum > max) max = sum;
				}
			}


			System.out.println(max);
		}

	}
}