import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      double a = sc.nextDouble();
      double sum = 0;
      for (int i = 0; i < 5; i++) {
        sum += a;
        a *= 2;
        sum += a;
        a /= 3;
      }
      System.out.println(sum);
    }
  }
}