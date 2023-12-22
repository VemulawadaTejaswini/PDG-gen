import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long max = 0;
    for(int i = 0;i < n;i++){
      a[i]=sc.nextLong();
      max = Math.max(max,a[i]);
    }
    long num = 0;
    long k = max/2;
    long min = 1000000000;
    if(max%2==0){
      for(int i = 0;i < n;i++){
        if(a[i]!=min){
          min = Math.min(min,Math.abs(a[i]-k));
          if(min==Math.abs(a[i]-k))num=a[i];
        }
      }
    }else{
      for(int i = 0;i < n;i++){
        if(a[i]!=min){
          min = Math.min(min,Math.min(Math.abs(a[i]-k),Math.abs(a[i]-k-1)));
          if(min==Math.abs(a[i]-k))num=a[i];
          else if(min==Math.abs(a[i]-k-1))num=a[i];
        }
      }
    }
    System.out.println(max+" "+num);
  }
}