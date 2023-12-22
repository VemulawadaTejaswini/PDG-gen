import java.util.*;
public class Main{
  public static void main(String args[]){
  	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long arr[]=new long[n];
    for(int i=0;i<n;i++){
    	arr[i]=sc.nextLong();
    }
    int i=0,start=0;
    long count=0;
    while(i<n){
    	if(arr[start]>=arr[i]){
          count+=arr[start]-arr[i];
        }
      else{
      	start=i;
      }
      i++;
    }
    System.out.println(count);
  }
}