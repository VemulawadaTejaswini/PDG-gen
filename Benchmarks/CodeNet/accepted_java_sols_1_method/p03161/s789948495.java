import java.util.Scanner;
public class Main{
	public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
     	int n=sc.nextInt();
      	int k=sc.nextInt();
      	int arr[]=new int[n];
      	int diff[]=new int[n];
      	for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
          	if(i == 0) diff[i]=0;
          	else if(i == 1) diff[i]=Math.abs(arr[1]-arr[0]);
          	else{
            	int min=Integer.MAX_VALUE;
              	int j=i-1;
              	int count=k;
              	while( count>0 && j>=0){
                  int temp=diff[j]+Math.abs(arr[i]-arr[j]);
                	if(temp<min)
                      min=temp;
                      j--;
                      count--;
                }
              diff[i]=min;
            }
        }
      
      	System.out.println(diff[n-1]);
      	
      	
    }
}