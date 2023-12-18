import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int X = sc.nextInt();
    System.out.println(X <= 500*K ? "Yes" : "No");
  }
}