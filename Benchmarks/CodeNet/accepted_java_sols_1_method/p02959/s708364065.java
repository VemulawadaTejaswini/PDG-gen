import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n+1];
    int[] arr1 = new int[n];
    for(int i=0;i<n+1;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      arr1[i]=sc.nextInt();
    }
    long sum=0;
    for(int i=0;i<n;i++){
 
      if(arr[i]+arr[i+1]<=arr1[i]){
     //   System.out.println("verma");
        sum=sum+arr[i]+arr[i+1];
        arr[i]=0;
        arr[i+1]=0;
      }
      else{
       
        if(arr[i]<=arr1[i]){
   //        System.out.println("anuj");
          arr[i+1]=arr[i+1]-(arr1[i]-arr[i]);
          arr[i]=0;
       //   System.out.println(arr[i+1]);
        }
        else{
   //       System.out.println("anuj1");
          arr[i]=arr[i]-arr1[i];
        }
         sum=sum+arr1[i];
      }
    }
    System.out.println(sum);
  }
}