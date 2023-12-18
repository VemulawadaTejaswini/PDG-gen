import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long p=1000000007;
    long summer=0;
    long[] a=new long[n];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextLong();
      if(i>0)summer=(summer+a[i])%p;
    }
    summer=(a[0]*summer)%p;
    for(int i=1;i<a.length;i++){
      long t=summer-a[i];
      if(t<0)t+=p;
      summer=(summer+(a[i]*summer))%p;
    }
    System.out.println(summer);
  }
}