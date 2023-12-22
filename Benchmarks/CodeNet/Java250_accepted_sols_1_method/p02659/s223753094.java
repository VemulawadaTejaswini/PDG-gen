import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    double b = sc.nextDouble();
    long ans = a * (long)(b*100+0.5);
    System.out.println(ans/100);

  }
}
