import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long sum=0;
		int[] num=new int[100001];
		for(int i=0; i<n; i++){
			int a=sc.nextInt();
			num[a]++;
			sum+=a;
		}
		int q=sc.nextInt();
		for(int i=0; i<q; i++){
			int b=sc.nextInt();
			int c=sc.nextInt();
			if(b>c){
				sum-=(b-c)*num[b];
				num[c]+=num[b];
				num[b]=0;
			}else{
				sum+=(c-b)*num[b];
				num[c]+=num[b];
				num[b]=0;
			}
			System.out.println(sum);
		}
	}
}
