import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int area = 0;

    if (n == m) {
      area = (n - 1) * (n - 1);
    } else if (n < m){
      area = ((n - 1) * (n - 1)) + ((m - n) * (n - 1));
      System.out.println();
    } else {
      area = ((m - 1) * (m - 1)) + ((n - m) * (m - 1));
    }

    System.out.println(area);

  }
}