import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int[] data = new int[n.length()];

    for (int i = 0; i < n.length(); i++) {
      data[i] = Integer.parseInt(n.substring(i,i+1));
    }

    long sum = 0;
    for (int i = 0; i < n.length(); i++) {
      sum += data[i];
    }

    if (Integer.parseInt(n) % sum == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
