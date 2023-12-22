import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    long ans=0;
    if(a[0]>x){
      ans=ans+a[0]-x;
      a[0]=x;
    }
    for(int i=1;i<n;i++){
      if(a[i-1]+a[i]>x){
        ans=ans+a[i-1]+a[i]-x;
        a[i]=x-a[i-1];
      }
    }
    System.out.println(ans);
  }
}