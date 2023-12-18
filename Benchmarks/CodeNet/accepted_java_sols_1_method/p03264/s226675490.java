import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = (int)(Math.pow(n/2, 2));
    System.out.println(n%2 == 0 ? ans : ans+(n/2));
  }
}
