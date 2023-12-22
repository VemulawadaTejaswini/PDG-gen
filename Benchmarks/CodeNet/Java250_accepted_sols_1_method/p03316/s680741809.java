import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String N = sc.next();

    sc.close();
    
    String[] arr = N.split("");

    int n = Integer.valueOf(N);

    int sn = 0;

    for (int i = 0; i < arr.length; i++) {
      sn += Integer.valueOf(arr[i]);
    }

    if (n % sn == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}