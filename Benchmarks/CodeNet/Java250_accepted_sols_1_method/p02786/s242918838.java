import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long all = 1;
    long B = 1;
    long H = sc.nextLong();   //the HP of monster
    double X = Math.log(H) / Math.log(2);
    long A = (int) X;

    for (int i = 0; i <= A-1; i++){
      B = B * 2;
      all += B;
    }
    System.out.println(all);
  }
}
