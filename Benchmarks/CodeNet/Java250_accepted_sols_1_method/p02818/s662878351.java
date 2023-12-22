import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    long k = sc.nextLong();
    long p = k - a;

    if(a>k){
      a = a-k;
    }else if(a<=k){
      a =0;
      b = b -p;
      if(b<0){
        b=0;
      }
    }

    System.out.println(a+" "+b);



  }

}