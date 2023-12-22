import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double n = sc.nextDouble();
    double ans;

    if(n % 2 == 0){
      ans = (n / 2) / n;
    } else {
      ans = (((int)(n) / 2) + 1) / n;
    }

    System.out.println(ans);
  }
}
