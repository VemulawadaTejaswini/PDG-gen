import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    float b = sc.nextFloat();
    long ans = a * (long)(b*100);
    System.out.println(ans);

  }
}
