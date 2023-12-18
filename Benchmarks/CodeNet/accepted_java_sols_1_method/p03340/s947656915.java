import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i<n; i++){
			a[i]=sc.nextLong();
		}
		long res=0;
		int r = 0;
		long sum=0;
		for(int l = 0; l<n; l++){
			while(r<n && (sum^a[r])==(sum+a[r])){
				sum+=a[r++];
			}
			res+=r-l;
			sum-=a[l];
			
		}
		System.out.println(res);
	}
}