import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
			arr[i]=sc.nextInt();
		int l=0,r=a-1;
		int s=arr[l]-arr[r];
		while(l<r-1){
			if(s<=0){
			l++;
            s=s+arr[l];			
			}
				else{
					r--;
					s=s-arr[r];
				}
		}
		System.out.println(Math.abs(s));
	}
}