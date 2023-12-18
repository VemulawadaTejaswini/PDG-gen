import java.util.*;
import java.math.*;

class Main{
  public static void main(String args[]){

    BigInteger n, m, tmp1, tmp2;
    tmp1 = new BigInteger(String.valueOf(10000));
    tmp2 = new BigInteger(String.valueOf(0));
    Scanner sc = new Scanner(System.in);
    int a, b;

    String t[] = {"", "Man", "Oku", "Cho", "Kei", "Gai", "Jo", "Jou", "Ko", "Kan",
      "Sei", "Sai", "Gok", "Ggs", "Asg", "Nyt", "Fks", "Mts"};

    while(true){
      a = Integer.parseInt(sc.next());
      b = Integer.parseInt(sc.next());
      if(a == 0) break;

      n = new BigInteger(String.valueOf(a));
      n = n.pow(b);

      String ans = "";
      int p = 0;

      while(!n.equals(tmp2)){
        m = n.remainder(tmp1);
        long temp = m.longValue();
        if(temp != 0){
          ans = String.valueOf(temp) + t[p] + ans;
        }
        n = n.divide(tmp1);
        p++;
      }

      System.out.println(ans);
    }
  }
}


