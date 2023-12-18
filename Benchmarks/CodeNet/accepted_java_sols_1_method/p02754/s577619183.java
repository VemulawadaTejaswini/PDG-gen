import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
        
    if(a>n){
      System.out.println(n);
      return;
    }
    
    long o = n/(a+b);
    o = o*a;
    long nokori = n % (a+b);

    
    if(nokori >=a)
      o += a;
    else
      o += nokori;
      
    System.out.println(o);
  }
}