import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();

    int sum = p + q + r - Math.max(p,Math.max(q,r));
    System.out.println(sum);
  }
}