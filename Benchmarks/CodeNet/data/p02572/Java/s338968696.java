import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long p=1000000007;
    Long summer=0;
    Long ans=0;
    long[] a=new long[n];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextLong();
      summer=(summer+a[i])%p;
    }
    for(int i=0;i<a.length;i++){
      summer-=a[i];
      if(summer<0)summer+=p;
      ans+=(a[i]*summer)%p;
    }
    System.out.println(ans);
  }
}