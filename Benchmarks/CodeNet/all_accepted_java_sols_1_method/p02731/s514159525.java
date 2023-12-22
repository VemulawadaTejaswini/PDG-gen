import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double l = sc.nextDouble();
    double ans = (l * l * l) / 27;
    
    System.out.println(ans);
  }
}
