import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String nn = sc.next();
    long n = Long.parseLong(nn);
    String aa = sc.next();
    String bb = sc.next();
    long a = Long.parseLong(aa);
    long b = Long.parseLong(bb);
    long set = 0;
    long amari = 0;
    if(!(a+b == 0)){
      set = n / (a+b);
      amari = n % (a+b);
    }
    long ama = a;
    if(amari < a){
      ama = amari;
    }
    System.out.println(set * a + ama);

  }
}
