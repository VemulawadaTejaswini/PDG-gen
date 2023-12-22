import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int x_500 =  n/500;
    n = n - n/500 * 500;

    int x_5 = n/5;

    int ans = x_500 *1000 + x_5 * 5;

    System.out.println(ans);

  }
}