import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int  n =scn.nextInt();
		int m =scn.nextInt();
		long k =scn.nextLong();
		long [] arr =new long[n];
		long [] arr2 =new long[m];
		long sum1=0;
		long count=0;
		int idx1=-1;
		int idx2=-1;
		boolean f=false;
		for(int i=0;i<arr.length;i++){
			 boolean ans=false;
			arr[i]=scn.nextLong();
			
			if(sum1+arr[i]<=k && f==false){
				sum1+=arr[i];
				idx1=i;
				count=i+1;
				ans=true;
			}
			if(ans==false){
				f=true;
			}
		}
		long sum=0;
		f=false;
		for(int i=0;i<arr2.length;i++){
			boolean ans=false;
			arr2[i]=scn.nextLong();
			
			
			if(sum+arr2[i]<=k && f==false){
				sum+=arr2[i];
				idx2=i;
				ans=true;
				count=Math.max(count, i+1);
			}
			if(ans==false){
				f=true;
			}
		}
	//	System.out.println(sum1 +"a"+sum);
		if(idx1==-1 || idx2==-1){
			System.out.println(count);
			return;
		}
		
		while(((sum+sum1)>k) && idx1>=0 && idx2>=0){
		//	System.out.println(sum1+sum);
			if(arr2[idx2]>arr[idx1] && idx2>=0){
				sum-=arr2[idx2];
				idx2--;
			}else{
				sum1-=arr[idx1];
				idx1--;
			}
		}
	//	System.out.println(idx1+"a"+idx2);
		idx1=Math.max(idx1+1 ,0);
		idx2= Math.max(idx2+1, 0);
		count=Math.max(idx1+idx2, count);
    
     
		System.out.println(count);

	}

}