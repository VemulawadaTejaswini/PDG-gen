import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long a=sc.nextLong();
    long b=sc.nextLong();
    long k=sc.nextLong();

    if (a+b<=k) {
      a=0;
      b=0;
    }else{
      if (a>=k) {
        a-=k;
      }else{
        b=b-(k-a);
        a=0;
      }
    }

    System.out.println(a+" "+b);
  }
}
