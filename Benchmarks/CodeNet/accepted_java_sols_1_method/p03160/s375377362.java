import java.util.*;
public class Main{
	public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
      	int size=sc.nextInt();
      	int[]  arr=new int[size];
      	for(int i=0;i<size;i++) arr[i]=sc.nextInt();
      	if(size==1) {System.out.println(0); return;}
      	if(size==2) {System.out.println(arr[size-1]-arr[size-2]);return;}
      	int[] nums=new int[size];
      	nums[0]=0;
     	nums[1]=(int)Math.abs(arr[1]-arr[0]);
      	for(int i=2;i<size;i++){
          
        	nums[i]=(int)Math.min((int)Math.abs(arr[i]-arr[i-1])+nums[i-1],(int)Math.abs(arr[i]-arr[i-2])+nums[i-2]);
        }
      System.out.println(nums[size-1]);
    }
}