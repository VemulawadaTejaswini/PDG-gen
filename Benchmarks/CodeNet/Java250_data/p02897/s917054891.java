import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();
    System.out.println(n%2 == 0 ? 0.5 : (n+1)/(n*2));
  }
}