import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
	     int arr[]=new int[a+2];
		 for(int i=1;i<=b;i++){
			 int m=sc.nextInt();
			 int n=sc.nextInt();
			 arr[m]=arr[m]+1;
			 arr[n+1]=arr[n+1]-1;
		 }
		 for(int i=2;i<=a+1;i++)
			 arr[i]=arr[i-1]+arr[i];
		 for(int i=1;i<=a;i++){
			  if(arr[i]>=b)
				 c++;
		 }
		 System.out.println(c);
	}
}