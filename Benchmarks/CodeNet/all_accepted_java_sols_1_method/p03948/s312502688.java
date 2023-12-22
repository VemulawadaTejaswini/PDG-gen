import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int a[]=new int[n];
		int d[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		d[n-1]=a[n-1];
		for(int i=n-1;i>=1;i--){
			if(a[i-1]>d[i]){
				d[i-1]=a[i-1];
			}else{
				d[i-1]=d[i];
			}
		}
		
		int count=0;
		int max=0;
		for(int i=0;i<n;i++){
			int p=d[i]-a[i];
			max=Math.max(max, p);
			//System.out.println(p);
		}
		for(int i=0;i<n;i++){
			int p=d[i]-a[i];
			if(p==max){
				count++;
			}
		}
		
		
		//System.out.println(Arrays.toString(d));
		System.out.println(count);
	}

}