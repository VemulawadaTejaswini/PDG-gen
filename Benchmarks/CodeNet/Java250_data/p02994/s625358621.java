import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int sum1=0,sum2=0;
		int[] a=new int[n+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				sum1+=l+j-1;
				if(j!=i)
				sum2+=l+j-1;
			}
			a[i]=sum1-sum2;
			if(a[i]<0)
			a[i]=-a[i];
			sum1=0;
			sum2=0;
		}
		int min=a[1];
		for(int i=1;i<=n;i++){
			if(min>a[i])
				min=a[i];
		}
		
		for(int i=1;i<=n;i++){
			if(min==a[i])
				for(int j=1;j<=n;j++){
					if(j!=i)
					sum2+=l+j-1;
				}
		}
		System.out.println(sum2);
		
	}
}
