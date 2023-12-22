import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int a = N / 100;
    int b = (N - 100 * a) / 10;
    int c = (N - 100 * a - 10 * b);
    if (a == c){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}