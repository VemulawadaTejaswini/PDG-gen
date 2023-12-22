import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] a=new int[n];
		int[] ans=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=n-1; i>=0; i--){
			int k=i+1;
			int sum=0;
			while(n>=k){
				sum+=ans[k-1];	
				k+=i+1;
			}
			if(sum%2==1){
				if(a[i]==1){
					ans[i]=0;
				}else{
					ans[i]=1;
					count++;
				}
			}else{
				if(a[i]==1){
					ans[i]=1;
					count++;
				}else{
					ans[i]=0;
				}
			}
		}
		System.out.println(count);
		for(int i=0; i<n; i++){
			if(ans[i]==1){
				System.out.println(i+1);
			}
		}
	}
}


