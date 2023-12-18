import java.util.*;
public class Main {
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    while(n!=0){
	        int[] num=new int[n];
	        for(int i=0;i<n;i++)num[i]=sc.nextInt();
	        int max=Integer.MIN_VALUE,min=0,sum=0;
	        for(int i=0;i<n;i++){
	        	sum += num[i];
	        	if(sum-min>max)max=sum-min;
	        	if(sum<min)min=sum;
	        }
	        System.out.println(max);
	        n=sc.nextInt();
	    }
	}
}
//by Tuvshee 12.05.2012
//Maximum sum sequence