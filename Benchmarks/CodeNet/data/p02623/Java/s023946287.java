import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    int arr1[] = new int[n];
    int arr2[] = new int[m];
    for(int i=0;i<n;i++){
    	arr[i] = sc.nextInt();
    }
    for(int i=0;i<m;i++){
    	arr1[i] = sc.nextInt();
    }
    int i=0,j=0,count=0;
    int res =0;
    while(res<=k){
    	if(arr[i]<arr1[j]){
        	res+=arr[i];
          	i++;
          count++;
        }
      	else{
        	res+=arr1[j];
          	j++;
          count++;
        }
    }
    System.out.println(count);
    
  	
  }

}
  