import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();

    long d = a / b;
    long r = a % b;
    double f = (double)a / (double)b;

    System.out.println(d + " " + r + " " + String.format("%.8f", f));
  }
}

