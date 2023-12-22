import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		Long[] arr=new Long[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextLong();
		}
		Arrays.sort(arr);
		long ans=0;
		for(int i=0;i<k;i++){
			ans+=arr[i];
		}
		System.out.print(ans);
	}
}