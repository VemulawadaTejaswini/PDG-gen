import java.util.*;
class Main{
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
  	int n = in.nextInt();
  	int a[] = new int[n];
  	int sum = 0;	
  	for(int i = 0; i < n; i++){
    	a[i] = in.nextInt();
      	sum+=a[i];
    }
  	int k = in.nextInt();
  	int p[] = new int[k];
  	int x[] = new int[k];
  	for(int i =0;i<k;i++){
    	p[i] = in.nextInt();
      	x[i] = in.nextInt();
      	int temp = sum; 
      	sum=sum-a[p[i]-1]+x[i];
      	System.out.println(sum);
      	sum = temp;
    }
  
}
}