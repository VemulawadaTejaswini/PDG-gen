import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long now = 100l;
    long year = 0l;
    while(now < x){
      year++;
      now += now / 100;
    }
    System.out.println(year);
  }
}
