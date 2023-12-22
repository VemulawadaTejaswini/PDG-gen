import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] arr = new long[n];
    long[] arr1 = new long[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextLong();
      arr1[i]=arr[i];
    }
    Arrays.sort(arr1);
    int flag=0;
    for(int i=0;i<n;i++){
      if(Math.abs(arr[i]-arr1[i])>1){
        flag=1;
        break;
      }
    }
    if(flag==1){
      System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }
   
  }
}