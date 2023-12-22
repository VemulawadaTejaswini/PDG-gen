import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long a = scan.nextLong();
    long b = scan.nextLong();
    long c = a+b;
    long d = n%c;
    if ((a == 0)||(c == 0)){
      System.out.println("0");
      return;
    }

    long g = (long) (n-d)/c;
    if (g == 0){
      if (n<=a){
        System.out.println(n);
      }
      else{
        System.out.println(a);
      }
    }
    else{
      long other = 0;
      if (d<=a){
        other = d;
      }
      else{
        other = a;
      }
      System.out.println(g*a+other);
    }
  }
}
