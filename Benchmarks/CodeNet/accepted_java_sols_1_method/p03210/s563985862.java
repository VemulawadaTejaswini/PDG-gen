import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();

    if (d == 3 || d == 5 || d == 7) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
