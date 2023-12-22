import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long L = sc.nextLong();
    long R = sc.nextLong();
    long mL = L%2019;
    long mR = R%2019;
    long out = 3000;
    if(R-L >= 2018 || mL > mR){
      System.out.println(0);
    } else {
      for (long i=mL; i<=mR-1; i++) {
        for (long j=i+1; j<=mR; j++) {
          if(out > (i*j)%2019){
            out = (i*j)%2019;
          }
        }
      }
      System.out.println(out);
    }
  }
}

