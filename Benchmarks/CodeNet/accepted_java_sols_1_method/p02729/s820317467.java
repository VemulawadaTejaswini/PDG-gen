import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int count1 = 0;
    int count2 = 0;

    if (n>=2) {
      count1 = (n*(n-1)) / 2 ;
    }

    if (m>=2) {
      count2 = (m*(m-1)) / 2 ;
    }

    System.out.println(count1 + count2);

  }
}
