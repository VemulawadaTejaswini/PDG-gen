import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] arr = new long[n];
    for(int  i=0;i<n;i++){
      arr[i]=sc.nextLong();
    }
    int max =0;
    int count=0;
    for(int i=0;i<n-1;i++){
      if(arr[i]>=arr[i+1]){
        count++;
      //  System.out.println(count);
      }
      else{
        if(count>max){
          max=count;
        }
        count=0;
      }
    }
    if(count>max){
      max=count;
    }
    System.out.println(max);
  }
}