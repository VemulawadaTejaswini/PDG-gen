import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long[] a=new long[n+1];
    long[] r=new long[n+1];
    boolean fl=true;
    for(int i=0;i<n+1;i++){
      a[i]=sc.nextLong();
      if(a[i]!=0){
        fl=false;
      }
    }
    if(fl){
      System.out.println(0);
      return;
    }
    for(int i=n-1;i>=0;i--){
      r[i]=r[i+1]+a[i+1];
    }
//    System.err.println(Arrays.toString(r));
    long ans=0;
    long cur=1;
    for(int i=0;i<n+1;i++){
      ans+=cur;
      if(cur<a[i]){
        System.out.println(-1);
        return;
      }
      cur-=a[i];
      cur=Math.min(cur*2,r[i]);
    }
    System.out.println(ans);
  }
}