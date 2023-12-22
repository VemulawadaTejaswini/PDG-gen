import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    long ans=Long.MAX_VALUE;
    for(int t=-100;t<=100;t++){
      long cost=0;
      for(int i=0;i<n;i++){
        cost+=(a[i]-t)*(a[i]-t);
      }
      ans=Math.min(ans,cost);
    }
    System.out.println(ans);
  }
}